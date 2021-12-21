package SET_in_java;
import java.util.*;



public class HASh_set {

    public static void main(String[] atgc)
    {
        HashSet<String> hash_set=new HashSet<>();
        hash_set.add("my");
        hash_set.add("name");
        hash_set.add("is");
        hash_set.add("aman");
        hash_set.add("nawal");
        hash_set.add("aman");            //set would not allow to store same elements
        System.out.println(hash_set);
        System.out.println(hash_set.contains("aman"));      //set uses contains to check weather a element is present
                                                            // in our set


        Set<Integer> set=new HashSet<>();
        set.addAll(Arrays.asList(new Integer[]{1,2,3,4,5100,1234,546,2}));      //addall method is being used to add
                                                                                 // all the elements in the set
        Set<Integer> set2=new HashSet<>();
        set2.addAll(Arrays.asList(new Integer[] {1,2,3,4,123,45,123}));   //before add all elements to the we need
                                                                          // to convert the object array to a list

        Set<Integer> union=new HashSet<>(set);      //passing set to the union set
        union.addAll(set2);                       //adding all the elements to our union=set set+set2
        //it would add all the elements but it would also remove the commons



        System.out.println(union);
        Set <Integer> intersection=new HashSet<>(set);
        intersection.retainAll(set2);                     //retainAll() method can be used as intersection
                                                 //it would retain the common elements present between teh sets
        System.out.println(intersection);



        Set<Integer> rem=new HashSet<>(set);
        rem.removeAll(set2);                            //would remove the common values between the two sets
                                                        //the remaining elements would be printed from set1
        System.out.println(rem);

    }
}
