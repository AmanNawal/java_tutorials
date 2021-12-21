package MAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

//it fetches us the data in the synchronised manner that is each pair entered would be received as it is entered
// by the user
//the nodes present in a linked map have previous and next references.
public class Linked_hash_map {
    public static void main(String[] argc)
    {
        LinkedHashMap<String,Integer> linked_hash=new LinkedHashMap<>();
        linked_hash.put("aman",1);
        linked_hash.put("nawal",2);
        linked_hash.put("yes",123);
        linked_hash.put("no",100);
        Iterator hash_iterator=linked_hash.entrySet().iterator();
        System.out.println("\n***************linked hash**************\n");

        while (hash_iterator.hasNext())              //insertion order is being maintained
        {
            System.out.println(hash_iterator.next());
        }

        System.out.println("\n***************** Hash_map *******************\n");

        HashMap<String,Integer> hash=new HashMap<>(linked_hash);
        Iterator hash_map=hash.entrySet().iterator();                  //random data from the hash_table as output
        while (hash_map.hasNext())                                      //not in a synchronised way
        {
            System.out.println(hash_map.next());
        }
    }


}
