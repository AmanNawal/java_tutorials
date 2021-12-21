package Arrays_CLASS_in_JAVA;

import java.util.Arrays;

public class parallel_methods_in_arrays {
    public static void main(String[] argc)
    {
        Integer[] arr={1,2,3,4};
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
