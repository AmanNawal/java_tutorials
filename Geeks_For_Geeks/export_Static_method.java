package Geeks_For_Geeks;

public class export_Static_method extends static_overriding{

    public static void display()
    {
        System.out.println("B");
    }


    public static void main(String[] ar)
    {
        static_overriding obj=new export_Static_method();
        obj.display();  //instead of printing B this code is printing A because of the use of static keyword in both the display() methods
        //if we remove static from them it would again print B as output
    }
}
