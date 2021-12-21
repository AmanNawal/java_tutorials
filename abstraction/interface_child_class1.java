package abstraction;

public class interface_child_class1 implements interface_base{
    @Override
    public void set_ph() {  // in the child class of the abstract or interface class you need to either convert the ::::
        System.out.println("this is the phone number:");  //complete class as abstract or you have to define the methods
    }

    public static void main(String []a)
    {
        interface_base obj=new interface_child_class1();//reference of the interface class is being created
        obj.set_ph();
    }
}
