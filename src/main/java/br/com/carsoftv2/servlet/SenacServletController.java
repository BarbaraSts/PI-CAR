package br.com.carsoftv2.servlet;

import br.com.carsoftv2.dao.carDao;
import br.com.carsoftv2.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/senac")
public class SenacServletController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String carName = request.getParameter("carName");


        Car car = new Car();
        car.setName(carName);

        carDao carDao = new carDao();
        carDao.createCar(car);


        request.getRequestDispatcher("sobre.html").forward(request, response);
    }
}
