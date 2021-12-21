package SET_in_java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

//A linked Hash set iterates the data entered in an ordered way
//It maintains a doubly linked list

public class Linked_hash_Set {
    public static void main(String[] argc)
    {
        LinkedHashSet<String> Linked_Set=new LinkedHashSet<>();    //it would iterate in the order as we have inputted the values
        HashSet<String> hash=new HashSet<>();
        hash.add("MY");
        hash.add("NAME");
        hash.add("IS");
        hash.add("AMAN");
        hash.add("NAWAL");

        System.out.println("iterating in a hash set!\n");
        Iterator I1=hash.iterator();
        while (I1.hasNext())
            System.out.println(I1.next());

        Linked_Set.add("1");
        Linked_Set.add("2");
        Linked_Set.add("3");
        Linked_Set.add("4");
        Linked_Set.add("5");
        Linked_Set.add("6");
         I1=Linked_Set.iterator();
        System.out.println("\nIterating in a linked set\n");
        while (I1.hasNext())
            System.out.println(I1.next());


    }
}
