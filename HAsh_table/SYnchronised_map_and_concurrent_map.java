package HAsh_table;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class SYnchronised_map_and_concurrent_map {

    public static void main(String [] argc)
    {
        Hashtable<String,Integer> m=new Hashtable<>();
        m.put("yes",1);
        m.put("no",2);
        m.put("aman",100);
        m.put("nawal",0);

        Map<String,Integer> map= Collections.synchronizedMap(m);     //a synchronised map is a thread safe map
        Iterator ier=map.entrySet().iterator();
        while (ier.hasNext())
        {
            System.out.println(ier.next());
        }

        //concurrent hash_map//

        ConcurrentHashMap<Integer,String> str=new ConcurrentHashMap<>();
        str.put(1,"nawal");
        str.put(2,"no");
        str.put(3,"from the bush");
        Iterator hash_map_iterator=str.entrySet().iterator();
        System.out.println(str.get(3));
        while (hash_map_iterator.hasNext())
        {
            System.out.println(hash_map_iterator.next());
        }



    }

}
