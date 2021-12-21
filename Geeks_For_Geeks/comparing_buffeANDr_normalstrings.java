package Geeks_For_Geeks;

import java.util.Locale;

public class comparing_buffeANDr_normalstrings {

    public static void main(String [] arg)
    {
        //comparing StringBuffer objects
        StringBuffer obj1=new StringBuffer("aman nawal");
        StringBuffer obj2=new StringBuffer("aman nawal");
        if(obj1.compareTo(obj2)==0)  //instead of equalto() compareto() gives us more precision in Buffer string
        {
            System.out.println("equal");
        }

        String one="GEHU";
        String two="gehu";
        if(two.toUpperCase(Locale.ROOT).equals(one))
        {
            System.out.println("equals::  "+ two.toUpperCase(Locale.ROOT));
        }
    }
}
