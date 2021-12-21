package Arrays_CLASS_in_JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Array_Class_methods {

    static Scanner scan=new Scanner(System.in);
    static public void main(String [] var)
    {
        Integer[][] arr={{1,2,3},{4,5,6}};
        Integer[][] arr1={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepEquals(arr,arr1)+"  "+Arrays.equals(arr,arr1));
        Integer[][] arr2=arr1.clone();
        String str=Arrays.deepToString(arr2);
        System.out.println(str);
        Integer [] array={100,200,300,400};
        Integer[] arrr=array.clone();
        Integer[] array2=Arrays.copyOf(array,10);
        System.out.println(Arrays.toString(arrr));

    }
}
