package Geeks_For_Geeks;

import java.util.Scanner;

public class Stringclass_to_characterarray {

   static Scanner scan=new Scanner(System.in);

    public static void main(String[] a)
    {
        String str="aman nawal";
        char[] s=str.toCharArray();
        for (char c:s)
        {
            System.out.println(c);
        }

        System.out.println("reverse without functions!");
        for (int i=s.length-1;i>=0;i--)
        {
            System.out.println(s[i]);
        }
    }
}
