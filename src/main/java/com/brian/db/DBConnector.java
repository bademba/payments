/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brian.db;

//import com.brian.c2b.C2BUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author brian
 */
public class DBConnector {

    private static final String MYSQL_DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String MYSQL_DB_CONNECTION = "jdbc:mysql://localhost:3306/safaricomtest?autoReconnect=true&useSSL=false";
    private static final String MYSQL_DB_USER = "root";
    private static final String MYSQL_DB_PASSWORD = "93ce662a-2be4-11ec-8d3d-0242ac130003";
    private static final String POSTGRES_DB_DRIVER = "org.postgresql.Driver";
    private static final String POSTGRES_DB_CONNECTION = "jdbc:postgresql://127.0.0.1:5432/safaricomtest";
    private static final String POSTGRES_DB_USER = "postgres";
    private static final String POSTGRES_DB_PASS = "password123";
    //private static final String POSTGRES_DB_PASS = "yWJ4oZLgJj9U2zKPXLtr";

    public static Connection getMysqlDBConnection() {

        Connection dbConnection = null;

        try {

            Class.forName(MYSQL_DB_DRIVER);

        } catch (ClassNotFoundException e) {

            System.out.println("Error -->" + e.getMessage());
            e.printStackTrace();
        }

        try {

            dbConnection = DriverManager.getConnection(MYSQL_DB_CONNECTION, MYSQL_DB_USER, MYSQL_DB_PASSWORD);
            return dbConnection;

        } catch (SQLException e) {

            System.out.println("Error -->" + e.getMessage());
            e.printStackTrace();

        }

        return dbConnection;

    }

    public static Connection getPostgresSqlDBConnection() {
        //start
        try {

            Class.forName(POSTGRES_DB_DRIVER);

        } catch (ClassNotFoundException e) {
            System.out.println(e.getException());
        }

        Connection postgres_connection = null;

        try {
            postgres_connection = DriverManager.getConnection(POSTGRES_DB_CONNECTION, POSTGRES_DB_USER, POSTGRES_DB_PASS);
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        if (postgres_connection != null) {
            System.out.println("Db connection successful!");
        } else {
            System.out.println("Failed to make connection!");
        }
        //end
        return postgres_connection;
    }

    public void close(Connection conn) {
        try {
            conn.close();
        } catch (Exception exeption) {
//            Logger lgr = Logger.getLogger(C2BUtils.class.getName());
//            lgr.log(Level.SEVERE, exeption.getMessage(), exeption);
            System.out.println("Error_Message==> " + exeption.getMessage());
        }
    }
}
