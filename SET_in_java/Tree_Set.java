package SET_in_java;


import java.util.Iterator;
import java.util.TreeSet;

//tree set similar to tree map stores the data in a tree
//it provides the data in the sorted order
public class Tree_Set {
    public static void main(String[] args)
    {
        TreeSet<String> tree=new TreeSet<>();
        tree.add("aa");
        tree.add("a");
        tree.add("c");
        tree.add("v");
        tree.add("zx");
        Iterator i=tree.iterator();
        while (i.hasNext())                        //the output would be in a sorted order
        {
            System.out.println(i.next());
        }

    }
}
