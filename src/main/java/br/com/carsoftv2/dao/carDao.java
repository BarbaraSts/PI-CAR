package br.com.carsoftv2.dao;

import br.com.carsoftv2.model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class carDao {

    public void createCar(Car car){

        String SQL = "INSERT INTO CAR(NAME) VALUES (?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");
            PreparedStatement preparedStatement = connection.prepareCall(SQL);

            preparedStatement.setString(1, car.getName());
            preparedStatement.execute();

            System.out.println("Success in Connection");

            connection.close();
        } catch (Exception e){

            System.out.println("Fail in Connection");
        }

    }
}
