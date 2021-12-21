package Geeks_For_Geeks;

public class object_class_base {

   static class A
    {
        public int a=100;
        public String display()
        {
            System.out.println("this is the static function");
            return toString();   //would return a string when called along with a Hashcode number
        }
        public void check(A obj)
        {
            System.out.println(this.equals(obj)); //would return a boolean statement and it would compare the objects
        }
    }
public static void main(String[] a)
{

    A obj=new A();
   String s= obj.display();
   A o=new A();
   obj.check(obj);
    System.out.println(s);   //Geeks_For_Geeks.object_class_base@------- would be output name of the string is Geeks---@hashno.
    System.out.println(obj.toString());  //would give the same output
    System.out.println(obj);//would give the same output
}

}
