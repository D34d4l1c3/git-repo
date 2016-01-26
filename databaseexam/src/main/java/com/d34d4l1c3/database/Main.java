package com.d34d4l1c3.database;

import com.mysql.fabric.jdbc.FabricMySQLDriver;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 * Created by Анна on 12.01.2016.
 */
public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args)
    {
        Connection connection;
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
           // connection = DriverManager.
           // Statement statement = connection.createStatement();
            //statement.execute("INSERT INTO animal(anim_name,anim_desc) VALUES('name','desc');");
           //int res =  statement.executeUpdate("UPDATE animal SET anim_name = 'New name' WHERE id = 1;");
           // ResultSet res = statement.executeQuery("SELECT * FROM animal");
            //System.out.println(res);
          /*  statement.addBatch("INSERT INTO animal(anim_name,anim_desc) VALUES ('batch','desc')");
            statement.addBatch("INSERT INTO animal(anim_name,anim_desc) VALUES ('batch','desc')");
            statement.addBatch("INSERT INTO animal(anim_name,anim_desc) VALUES ('batch','desc')");

            statement.executeBatch();
            statement.clearBatch();
            statement.getConnection();
            statement.close();

            boolean status  = statement.isClosed();
            System.out.println(status);
            //System.out.println(connection.isClosed());*/
            //Комментарий для проверки работы git
            if(!connection.isClosed())
            {
                System.out.println("Соединение с БД установлено");
            }
            connection.close();
            if(connection.isClosed())
            {
                System.out.println("Соединение с БД закрыто");
            }
        } catch (SQLException e) {
            System.out.println("Не удалось загрузить класс драйвера");
        }
    }
}
