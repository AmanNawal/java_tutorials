package Geeks_For_Geeks;

import java.util.Scanner;

public class has_next_funtion {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] a)
    {
        Integer age;
        int count=1;
        while (scan.hasNextInt())  //would see that the data entered in the scan is a integer
        {
            age= scan.nextInt();   //we are assigning int value to scan without this statement the while loop would run infinitely
            System.out.println(count+" age:: "+age);
        }
    }
}
