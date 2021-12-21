package ARRAY_LIST_DATA_STRUCTURE;

import java.util.ArrayList;
import java.util.Scanner;

public class array_list_too_array_second_type {


    static Scanner scan=new Scanner(System.in);

    static public void main(String[]ar)
    {
        ArrayList<Integer> array_list=new ArrayList<>();
        array_list.add(1);
        array_list.add(2);
        array_list.add(3);
        array_list.add(4);
        Integer []ob=new Integer[array_list.size()];    //
        array_list.toArray(ob);//this is the second toArray() which intakes the Integer array as parameter and returns an integer array
        for (int i=0;i<ob.length;i++)
        {
            System.out.println(ob[i]);
        }
        System.out.println(ob.getClass());
    }
}
