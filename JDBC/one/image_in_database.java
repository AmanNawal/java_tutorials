package JDBC.one;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class image_in_database {
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
//image uses blog data type to be stored
        String q="INSERT INTO images(pic) values(?)";
        FileInputStream input=new FileInputStream("D:\\computer science\\src\\ace.jpg");
        PreparedStatement prep=con.prepareStatement(q);//create a prepared statement
        prep.setBinaryStream(1,input,input.available());  //add inputfilestream
        prep.executeUpdate();
        System.out.println("done");
    }
}
