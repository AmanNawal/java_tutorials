package HAsh_table;

import java.util.*;

public class hash_map_to_array_list {
    static public void main(String[] argc)
    {
        HashMap<String,Integer> hash_map=new HashMap<>();
        hash_map.put("aman",1);
        hash_map.put("priya",2);
        hash_map.put("yes",3);
        List<String> arr=new ArrayList<String>(hash_map.keySet());//converting a hash_map keys into a array_list
        ArrayList<Integer> in=new ArrayList<Integer>(hash_map.values());  //converting the hash_map into a list and
        // then storing the values of that hash_map to that array_list
        System.out.println("\nkeys of the hash map\n");
        for (String str:arr)
        {
            System.out.println(str);
        }
        System.out.println("\nvalues in the hash_map\n");
        for (Integer i:in)
        {
            System.out.println(i);
        }

    }

}
