package Arrays_CLASS_in_JAVA;

import java.util.Arrays;

public class deep_equals {
    static public void main(String[] argc)
    {
        char[][] arr={{'a','b','c'},{'d','e','w'},{'f','g','h'}};
        char[][]  arr2={{'a','b','c'},{'d','e','w'},{'f','g','h'}};
        System.out.println(Arrays.deepEquals(arr,arr2));  //can be used to check weather the multi dimentional arrays are equal
    }
}
