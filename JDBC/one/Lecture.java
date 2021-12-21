package JDBC.one;

/*
import java sql
load and register a driver
create connection
create a statement
execute a query
process the result
close
*/

import com.mysql.cj.protocol.Resultset;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Lecture {
    public static void main(String [] args) throws Exception
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

        //the connection is established now we need to fire the query
       /* Statement statement= con.createStatement();
       Resultset result= (Resultset) statement.executeQuery("select * from pers");
*/
    }
}
