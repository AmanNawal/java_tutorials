package Arrays_CLASS_in_JAVA;

import java.util.Arrays;

public class Arrays_comapre_methods {

    public static void main(String[] argc)
    {
        Integer []arr={1,2,3,4};
        Integer[] ar={1,2,3};
        String[] str={"aman","nawal"};
        String[] s={"AMAN".toLowerCase(),"NAWAl".toLowerCase()};  //array.compare() function would return a integer if the arrays are not equal
        System.out.println(Arrays.compare(arr,ar)+" "+Arrays.compare(str,s));    //if the arrays are equal then the function would return 0
    }
}
