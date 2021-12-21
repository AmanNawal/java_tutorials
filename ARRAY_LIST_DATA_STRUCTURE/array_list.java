package ARRAY_LIST_DATA_STRUCTURE;

import java.util.*;                   //arraylist<> is contained by java.util package
public class array_list {
   static Scanner scan=new Scanner(System.in);
    public static void main(String[]argc)
    {
        ArrayList<String> array_list=new ArrayList<>();     //in order to initialize it with suitable number
        // add a parameter to arraylist<>(X)
        for(int i=0;i<5;i++)
        {
            array_list.add(scan.nextLine());  //add funtion used for adding data to the end of array_list
        }

        array_list.remove(2);  //can be used to remove data from an index


        array_list.add(2,"yes");
        array_list.set(1,"no");
        array_list.remove("3");  // entered parameter has to be a String would remove 3 and will return true if performed successfully else false
        //if there are multiple 3's then it would remove the first 3
      array_list.remove("aman");

        for (String str:array_list)
        {
            System.out.println(str);  //get function can be used to get data from array index
        }
    }
}
