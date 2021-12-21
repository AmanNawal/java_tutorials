package ARRAY_LIST_DATA_STRUCTURE;

import java.util.*;

public class array_list_to_array_conversion {
    static Scanner scan=new Scanner(System.in);

static public void main(String[]ar)
{
    ArrayList<Integer> array_list=new ArrayList<>();
    array_list.add(1);
    array_list.add(2);
    array_list.add(3);
    array_list.add(4);
    Object []ob=array_list.toArray();    //an array of object type is used along with an inbuilt method named .toarray
                                         //to convert array_list to an object array
    for (int i=0;i<ob.length;i++)
    {
        System.out.println(ob[i]);
    }
}
}
