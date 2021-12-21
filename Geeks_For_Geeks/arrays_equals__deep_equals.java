package Geeks_For_Geeks;

import java.util.Arrays;

public class arrays_equals__deep_equals {

    static public void main(String[] ar)
    {
        int []arr={1,2,3,4};
        int []arr1={1,2,3,4};
        System.out.println(arr.equals(arr1));  //would return false won't work on arrays
        System.out.println(Arrays.equals(arr,arr1));  //would compare arrays but won't do it deeply(object class level)
        // it is ok to use this methods for array class


        Object []arr2={arr};  //arr2 has arr single instance{}
        //instance at object class level method equals{} won't work
        Object []arr3={arr1};
        //in this case for deep comparision we use deepEquals()
        System.out.println(Arrays.deepEquals(arr2,arr3));  //would compared deeply to the object level

    }
}
