package HAsh_table;


//hash_table are synchronous in nature i.e. it's thread safe(while one thread is accessing other threads won't be able to access)
//similar to hash map it also stores data on the basis of key value pair
//in hash table the key is stored in the form of object and each object in java has
// its hash code-->(32 bit integer number) and on that particular hash code the value would be stored
//hash-map vs hash table  ->>table would store the value on the basis of the hash code where as in map you would have to provide the key


import java.util.*;

public class methods_of_hash_table {

static Scanner scan=new Scanner(System.in);
public static void main(String [] argc)
{
    Hashtable h_t=new Hashtable();
    h_t.put(1,"yes");  //put method being used to add data top the hash table
    h_t.put("no",2);
    h_t.put(3,"aman");

    Hashtable ht2=new Hashtable();      //you may define some generics in hash table<>
    ht2=(Hashtable) h_t.clone();          //cloning a has table to another one clone() would return o
    // bject so it needs to be type casted to HAsh table first


    //printing method for hash tables//
    System.out.println(h_t);    //would print in the {key=value} form
    System.out.println(ht2);

    h_t.clear();  //would clear all the values from h_t  //

    System.out.println("is empty: "+h_t);   //{}


    //contains function//

    ht2.put("muda",123);
    ht2.put('c',"jojo");

    System.out.println(ht2.containsValue(123));    //would check the value in the hash table
    System.out.println(ht2.containsKey('c'));      //would check the key in the hash table


//printing all the values from the hash table//
    System.out.println("\n***********************\n");
Enumeration e =ht2.elements();
while (e.hasMoreElements())
{
    System.out.println(e.nextElement());
}
    System.out.println("\n********************\n");
    Set s= ht2.entrySet();                               //using set to print the hash table
    System.out.println(s);


    //comparing hashtables with each other//
    h_t=(Hashtable) ht2.clone();
    System.out.println("is ht2 = h_t :"+h_t.equals(ht2));    //equals can be used to compare hash tables//


    //getting value from a key//
    System.out.println(ht2.get(3));


    //getting the hash code from the object//
    System.out.println("hash code ht2: "+ht2.hashCode()+"   hash code of h_t:  "+ h_t.hashCode());
    }
}
