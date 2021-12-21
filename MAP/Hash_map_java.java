package MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//implements key-value pair
//hash-map is non-synchronised that means it is not thread safe i.e. multiple threads can access hash-map simultaneously
//drawback_it has a fail fast condition  (any thread modifies the map structure and changes the implementation of other threads)




//class created to implement user defined map value//
class Student
{   static Scanner scan=new Scanner(System.in);
    private String name;
    private int rollno;
    Student() {
        System.out.println("enter name of the student!");
        this.name=scan.nextLine();
        System.out.println("enter Students roll no.");
        this.rollno=scan.nextInt();
        scan.nextLine();
    }

    public void display_data() {
        System.out.println("name :"+this.name+" \nroll no:  " +this.rollno);
    }
}


public class Hash_map_java extends Student{


    public static void main(String[] args)
    {
        HashMap<String,Integer> HM=new HashMap<String,Integer>();    //creating a hASH MAP
        HM.put("aman nawal",0);          //put method is used to add data to the hash map
        HM.put("priya nawal",23);
        HM.put("t-fue",99);
        HM.put("shroud",100);

        System.out.println(HM.get("aman nawal"));   //get method is used to get the value of the
        HM.put("t-fue",100);
        HM.put("t-fue",123);            //we can change a value by using put("same -index")//
        // given key entered by the user






        for (Map.Entry map_printer:HM.entrySet())       //map.Entry is used to create a iterator like member to
            // print all the elements in the class
        {
            System.out.println(map_printer.getKey()+"  "+map_printer.getValue());
            //getKey() is used to get the key and getValue() is used to print the value
        }




        HM.remove("aman nawal");  //is used to remove the value by taking key as parameter




        System.out.println("\n***********************\n");
        for (Map.Entry map_printer:HM.entrySet())
        {
            System.out.println(map_printer.getKey()+" "+map_printer.getValue());
        }



        System.out.println("\n*************************\n");
        // another way of printing the value of map//
        System.out.println(HM);          //would print map in the form {key1=value1,key2=value2}



        System.out.println("\n****************************\n");
        //creating a hash map with user defined data type//
        HashMap<Integer,Student> stu=new HashMap<Integer,Student>();


        stu.put(1,new Student());                    //passing an instance of the student class
        stu.put(4,new Student());

//printing a user defined class object data//
        for (Map.Entry<Integer,Student> map_printer:stu.entrySet())     //whenever printing the data from a user defined
        {                                                              //class you have to include generics and mention
                                                                            // the data type which is going to be used
            Student s=map_printer.getValue();
            System.out.println(map_printer.getKey()+"  ");
            s.display_data();
        }






    }
}
