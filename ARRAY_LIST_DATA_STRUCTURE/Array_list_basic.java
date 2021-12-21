package ARRAY_LIST_DATA_STRUCTURE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Array_list_basic {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] argc)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("aman");
        list.add("nawal");
        list.add("yes");
        list.remove("yes");
        Iterator list_iterator=list.listIterator();
        while (list_iterator.hasNext())
        {
            System.out.println(list_iterator.next());
        }
    }
}
