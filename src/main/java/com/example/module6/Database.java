package com.example.module6;

import java.sql.*;

public class Database
{
    //database connection
    static final String DB_URL = "jdbc:mysql://localhost:3306/word_occurrences";
    static final String USER = "root";
    static final String PASS = "";

    public Database()
    {
    }

    //connection to DB and create new schema
    public void insertValues(String word, int value)
    {
        try
        {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            String sql = "INSERT INTO words VALUES ('"+ word +"',"+ value +")";
            stmt.executeUpdate(sql);
        }

        catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }

    public String readValues()
    {
        try
        {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            String read = "SELECT * FROM words";
            ResultSet resultSet = stmt.executeQuery(read);
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();

            while(resultSet.next())
            {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(",  ");
                    String columnValue = resultSet.getString(i);
                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println("");
            }
        }

        catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        return null;
    }

}



