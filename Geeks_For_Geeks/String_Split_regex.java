package Geeks_For_Geeks;

import java.util.ArrayList;

public class String_Split_regex {

    public static void main(String[] ar)
    {
        ArrayList<String> str=new ArrayList<>();
        str.add("aman@nawal");
        String []st=str.get(0).split("@");  //will split the sub-strings on the basis of regex "2@" and it will be stored in a string array
        for (int i=0;i<st.length;i++)
        {
            System.out.println(st[i]);
        }
        for(String s:st)
        {
            System.out.println(s);
        }
    }
}
