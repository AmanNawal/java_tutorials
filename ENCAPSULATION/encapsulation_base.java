package ENCAPSULATION;

import java.util.Scanner;

public class encapsulation_base {
    Scanner scan=new Scanner(System.in);
    private long phone_number;
    private String name;
    private String address;
    public void set_name()
    {
        System.out.println("Enter your name: ");
        name=scan.nextLine();
    }
    public void set_Phone_number()
    {
        System.out.println("Enter your phone number:");
        phone_number=scan.nextLong();
    }
}
