package Geeks_For_Geeks;

class G
{
    private Integer i=100;
    {
        System.out.println("IIB called!");   //instant-initialization-block is executed even before the constructor
        System.out.println(i*2);                  //THIS BLOCK IS EXECUTED EVEN BEFORE THE CONSTRUCTOR
    }

    G()
    {
        System.out.println("COnstructor called!");
    }
    private void display()
    {
        System.out.println("display!");
    }
}


class A extends G
{
    A()
    {
        System.out.println("A");
    }
}


public class instance_initialtion_block {




    public static void main(String[]  ar)
    {
        instance_initialtion_block p=new instance_initialtion_block();
        A o=new A();
        G obj=new G();



    }

}
