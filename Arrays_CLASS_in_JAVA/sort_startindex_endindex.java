package Arrays_CLASS_in_JAVA;

import java.util.Arrays;



public class sort_startindex_endindex {

    static public void main(String[] argc)
    {
      Integer[] arr={1,2,3,4,54,56,6,234,54,344};
      Arrays.sort(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
}
