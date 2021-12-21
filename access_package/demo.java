package access_package;
import inheritance.*;// importing entire package
import ENCAPSULATION.encapsulation_base;     //importing a class from the base

public class demo extends superbike
{
      public String floaters="yes";


    public void set_engine()
    {
        this.engine=500;
    }

public void display()
{
    this.set();
    this.set_engine();
    System.out.println("Future floaters:  "+floaters);
    super.display();
}

    public static void main(String []argc)
    {
        rough_work.abstraction1 ob;   //without importing directly accessing rough_work package
        demo obj=new demo();
        obj.display();
    }
}
