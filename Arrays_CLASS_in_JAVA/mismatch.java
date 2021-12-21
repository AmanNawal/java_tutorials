package Arrays_CLASS_in_JAVA;

import java.util.Arrays;

public class mismatch {

    public static void main(String[] argc)
    {
        Integer[] arr={1,2,3,4};
        Integer[] brr={1,2,3,40};
        System.out.println(Arrays.mismatch(arr,brr));  //this function would return a index value
        // if there is a mismatch between the two arrays
    }
}
