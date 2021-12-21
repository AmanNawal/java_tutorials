package JDBC.one;

import java.sql.*;

public class jdbcrough {
    public static void main(String [] args)throws Exception
    {
        String url="jdbc:mysql://localhost:3306/first",name="root",pass="namanama";
        Class.forName("com.mysql.cj.jdbc.Driver");   //load Driver and register
        Connection con= DriverManager.getConnection(url,name,pass);  //create connection
        //since connection is an interface we use get connection to get Connection

        if(con.isClosed())
        {
            System.out.println("Connection not established\n");
        }
        else
            System.out.println("Connection established\n");
        String create_table_query="SELECT id FROM readingpurpose ORDER BY id DESC LIMIT 1";
        PreparedStatement stmt= con.prepareStatement(create_table_query);
        ResultSet resultSet =stmt.executeQuery();
        while(resultSet.next())
        {
            System.out.println(resultSet.getString(1));
            System.out.println("loop working:");
        }
        System.out.println("done");

        con.close();


    }
    }

