package JDBC.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class getlastelementfromtable {

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
        PreparedStatement preparedStatement=con.prepareStatement("select id from readingpurpose order by id desc limit 1");
        ResultSet resultSet=preparedStatement.executeQuery();
        while(resultSet.next())
        {
            System.out.println(resultSet.getString(1));
        }
    }
}
