package JDBC.one;

import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishingAConnection {

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
    }
}
