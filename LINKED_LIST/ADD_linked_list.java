package LINKED_LIST;

import java.util.*;

public class ADD_linked_list {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] argc)
    {
        LinkedList<String> list=new LinkedList<String>();
        list.add("aman");
        list.add("nawal");
        list.add("GEHU");   //add method is used to add data to the linkedlist
        list.add("Dehradun");
        list.add("UTTRAKHAND");
        System.out.println(list);     //[list will be printed in this form]

        list.addFirst("this is first");
        list.addLast("this is last");
        System.out.println(list);

        System.out.println("value at first index:  "+ list.get(0));
        list.set(0,"setting index");
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(list);
        Iterator<String> i=list.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }


    }
}
