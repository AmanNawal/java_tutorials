package Geeks_For_Geeks;

import java.util.Locale;
import java.util.Scanner;

class str
{
    str(StringBuffer string)
    {

        System.out.println("Length of the string:  "+string.length());
        System.out.println("adding something to the string  "+string.append(" nawal")+" result::  "+  string);
        System.out.println(" replacing first four letters of the string with 'nama'   ::" +string.replace(0,4,"nama"));

        System.out.println(string.indexOf("nawal"));//can find the string entered in the parameter in other string and returns us the index
        String yes=string.substring(2,9);   //would return us a substring starting from index 2 and ending at 9
        System.out.println(yes);
        System.out.println(yes.toUpperCase(Locale.ROOT));
        String na=string.toString().toUpperCase(Locale.ROOT);
        int axz=1002;
        String uio="         yes o yes         ";
        uio=uio+axz;    //intrinsic conversion
        System.out.println(uio.trim());   //would remove the white spaces from the starting and the ending point of the string
        System.out.println(uio);
        System.out.println(na);
    }
}




public class Strings_in_geeks {
    static Scanner scan=new Scanner(System.in);

    public static void main(String [] arg)
    {
        StringBuffer st=new StringBuffer("aman");
        str obj=new str(st);
    }
}
