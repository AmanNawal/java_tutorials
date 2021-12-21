package Arrays_CLASS_in_JAVA;

import java.util.Arrays;

public class Equals {
    static public void main(String[] argc)
    {
        Integer[] arr={1,2,3};
        Integer[] brr= Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(brr));
        System.out.println(Arrays.equals(arr,brr));   //would return a boolean value on the basis
        // of the equality of two arrays
    }
}
