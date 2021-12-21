package JDBC.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class create_a_createTable_query {

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

        String create_table_query="CREATE TABLE REGISTRATION " +    //create a query
                "(id INTEGER not NULL, " +
                " first VARCHAR(255), " +
                " last VARCHAR(255), " +
                " age INTEGER, " +
                " PRIMARY KEY ( id ))";
        Statement stmt= con.createStatement();        //create a statement
       stmt.executeUpdate(create_table_query);        //execute the statement by the help of query created
        System.out.println("done");

        con.close();
    }
    }

