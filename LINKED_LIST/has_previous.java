package LINKED_LIST;

import java.util.LinkedList;
import java.util.ListIterator;

public class has_previous {

static public void main(String[] argc)
{
    LinkedList<String> list=new LinkedList<String>();
    list.add("aman");
    list.add("nawal");
    list.add("yes");
    ListIterator<String> iter=list.listIterator();
    while (iter.hasNext())
    {
        System.out.println(iter.next());
    }

    while (iter.hasPrevious())
    {
        System.out.println(iter.previous());
    }
    while (iter.hasNext())
    {
        System.out.println(iter.next());
    }


    list.clear();


}
}
