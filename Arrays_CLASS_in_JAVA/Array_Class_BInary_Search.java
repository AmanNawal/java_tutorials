package Arrays_CLASS_in_JAVA;

import java.util.Arrays;

public class Array_Class_BInary_Search {
    public static void main(String[] aragc)
    {
        Integer[] arr={1,2,3,4,5};
        Integer[] arr1={1,2,3,4,5};
        System.out.println(Arrays.binarySearch(arr,4));  //would return the index of the data you want to search
        System.out.println(Arrays.binarySearch(arr1,0,3,3));   //can take the range as parameters for searching
    }
}
