package Geeks_For_Geeks;

import java.util.StringTokenizer;

public class STring_tokenizer {

    public static void main(String[] argc)
    {
        StringTokenizer obj=new StringTokenizer("my name is aman nawal");  //string tokenizer class can be used to
        //seperate each sub string from objects
        int words=obj.countTokens();
        System.out.println("no. of words contained by the string::  "+words);
        while (obj.hasMoreTokens())  //would return till the string ends
        {

            System.out.println(obj.nextToken());//is being used to print the next string
        }
    }

}
