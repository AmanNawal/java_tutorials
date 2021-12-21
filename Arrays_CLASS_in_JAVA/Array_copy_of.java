package Arrays_CLASS_in_JAVA;

import java.util.Arrays;

public class Array_copy_of {
    public static void main(String[] argc)
    {
        String []str1={"aman","nawal"};
        String []str2= Arrays.copyOf(str1,6);  //using this function you can copy an array to another array +
        //you can add a new length
        String s=Arrays.toString(str2);
        System.out.println(s);

    }
}
