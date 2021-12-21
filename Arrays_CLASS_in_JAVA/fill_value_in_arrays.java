package Arrays_CLASS_in_JAVA;

import java.util.Arrays;

public class fill_value_in_arrays {
    public static void main(String[] argc)
    {
        Integer[] arr={1,2,3,4};
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,420);
        System.out.println(Arrays.toString(arr));  //would completely fill an single value in the entire array
    }
}
