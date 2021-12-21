package Geeks_For_Geeks;

class con_yes{
    public void aman(StringBuffer str)
    {
        str.append("gehu");
    }
}


public class String_vs_BufferString {

    public int con(StringBuffer str)
    {
        str.append("nawal");
        return 0;
    }

    public String con_str(String str)
    {
        str=str+"aman";
        return str;
    }



    public static void main(String[] a)
    {
        StringBuffer str=new StringBuffer("aman");
        StringBuffer st=new StringBuffer("aman");   //Buffer string is like a global string

        String o="nawal";
        String b="nawal";
        String_vs_BufferString ob=new String_vs_BufferString();
        ob.con(str);
        System.out.println(str);  //string buffer class is able to append without even returning any string from the method to the main()(MUTABLE)
        ob.con_str(o);
        System.out.println(o);  //string on the other side needs a return string in order to change o=ob.con_str(o); (IMMUTABLE)
        con_yes i=new con_yes();
        i.aman(st);
        System.out.println(st);

    }
}
