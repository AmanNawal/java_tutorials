package JDBC.one;

import java.sql.*;
import java.util.Scanner;


//prepared statement is used for dynamic query i.e. if our query accepts parameters i.e. runtime data processing

public class dynamic_query {
    public static Scanner scan=new Scanner(System.in);

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

            //here ? denotes that there is no initial value decided to be registered in our database
   /*     String insert_query="insert into registration values(?,?,?,?);";  //initially we do not know about the values to be inserted in the table

        //create prepare statement

            PreparedStatement prep=con.prepareStatement(insert_query);    //using preparedStatement we pass our query to prep
            prep.setString(1,"1");     //using set string to enter data to the table
            prep.setString(2,"nawal");
            prep.setString(3,"aman");

            prep.setString(4,"34");
            prep.executeUpdate();*/
            //String insert_query2="insert into registration values(1,'nawal','nawal',12)";
            Statement stmt= con.createStatement();


            int i=10;
            String first_name,last_name;
            int age=0;
            int []arr={1,2,3,4};
            while(true)
            {int j=0;
                System.out.println("enter first name: ");
                first_name=scan.nextLine();
                if(first_name=="-1")
                {
                    break;
                }
                System.out.println("\n enter the last name");
                last_name=scan.nextLine();
                System.out.println("\nenter the age of the person:");
                age=scan.nextInt();
                scan.nextLine();
                String insert_query2="insert into registration values(?,?,?,?)";
                PreparedStatement prep=con.prepareStatement(insert_query2);
                prep.setString(arr[j], String.valueOf(i));
                j++;i++;
                prep.setString(arr[j],first_name);j++;
                prep.setString(arr[j],last_name);j++;
                prep.setString(arr[j], String.valueOf(age));
                prep.executeUpdate();

            }

            con.close();



        }
        }

