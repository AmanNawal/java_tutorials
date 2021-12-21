package Geeks_For_Geeks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Decimal_format_Class {
    static Scanner scan=new Scanner(System.in);

public static void main(String[] argc)
{
    double num=1234.1234;
    DecimalFormat dec=new DecimalFormat("####"); //pattern provided in the format has no decimal
    System.out.println(dec.format(num));  //would print 1234


    DecimalFormat dec1=new DecimalFormat("####.###");  //would print up to 3 decimal degits
    System.out.println(dec1.format(num));

    DecimalFormat dec2=new DecimalFormat("#.0000000");  //would append 3 O's to the end of decimal digits
    System.out.println(dec2.format(num));

    DecimalFormat dec3=new DecimalFormat("0000000.0000000");   //would append three 0's to the start and three 0's to the end
    System.out.println(dec3.format(num));

}
}
