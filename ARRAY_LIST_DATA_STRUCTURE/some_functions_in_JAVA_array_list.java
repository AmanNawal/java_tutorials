package ARRAY_LIST_DATA_STRUCTURE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class some_functions_in_JAVA_array_list {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] argc)
    {
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);

        ArrayList<Integer> arr2=new ArrayList<Integer>();

        arr2.add(5);
        arr2.add(6);
        arr2.add(7);
        arr2.add(8);

        arr1.addAll(arr2);             //this method is used to add all the elements of arr2 to arr1
        for (Integer i:arr1)
        {
            System.out.println(i);
        }

        System.out.println("*************");
        arr1.retainAll(arr2);          //this method would remove non-similar elements
                                      //only the elements same as arr2 would be left
        for (Integer i:arr1)
        {
            System.out.println(i);
        }
        arr1.removeAll(arr2);      //would remove the elements which are similar to arr2
        if(arr1.isEmpty())
        {
            System.out.println("array is empty!");
        }
        else
        {
            for (Integer i:arr1)
            {
                System.out.println(i);
            }
        }

    }

}
