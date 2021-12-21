package Geeks_For_Geeks;

public class String_to_Integer {


    public static void main(String[] ar)
    {
        String str="100";
        Integer ty=Integer.parseInt(str)+200;  //Integer.parseInt() is used in java to convert string in integers
        System.out.println(ty);
        String s="200";
        Integer i=Integer.valueOf(s);  //valueOf() function also converts String into integers
        System.out.println(ty+i);

    }
}
