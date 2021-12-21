package Geeks_For_Geeks;

public class integer_to_String {
    public static void main(String[] a)
    {
        StringBuffer str=new StringBuffer("aman");
        StringBuffer st=new StringBuffer("aman");
        Integer j=2134;
        String o=new Integer(j).toString();        //1st method
        String k=j.toString();                     //2nd method
        String p=""+j;                             //3rd method
        System.out.println("  "+o+"  "+k+" "+p);
        System.out.println(o.getClass()+"   "+k.getClass()+"   "+p.getClass());
    }
}
