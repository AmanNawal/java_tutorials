package Geeks_For_Geeks;

import java.util.Scanner;

public class Basiscs_of_arrays {

    static Scanner scan=new Scanner(System.in);
    public static void main(String[] a)
    {
        int [] arr=new int[3];       //allocating an array with the new keyword
        int arr2[]=new int[]{11,12,13,14};   //using array literal to create an already initialized array
        int arr3[]={11,12,13,14};  //in new version of java new int keyword is not necessary for literal array
        //if we try to access a non initialised array like arr the compiler won't give an error
        //it would just print 0 in case of int ,false in case of boolean ,0.0 -double,string-NULL,user defined data type-NULL
        for (int i:arr)
        {
            System.out.println(i);  //would print 0,0,0 because there is no data initialized in the array
        }
    }
}
