package Arrays_CLASS_in_JAVA;

import java.util.Arrays;

public class Copy_of_range {
    static public void main(String[] argc)
    {
        Integer[] arr={1,2,3,4};
        Integer[] array= Arrays.copyOfRange(arr,0,2); //function can be used to copy an array up to the given
        //indexes
        System.out.println(Arrays.toString(array));
    }
}
