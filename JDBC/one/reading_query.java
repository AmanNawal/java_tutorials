package JDBC.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class reading_query {

    public static void main(String[] args) throws Exception
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
        Statement stmt= con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from registration");
        while(rs.next())
        {
            System.out.println("NAME:"+rs.getString("first")+" "+rs.getString("last")+"\n"+"AGE: "+rs.getString("age"));
        }
        con.close();
    }
    }

