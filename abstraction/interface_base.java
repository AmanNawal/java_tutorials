package abstraction;

public interface interface_base {  //there is no constructor in an interface like in an abstract class
    long phone_no=1298634128;     //the variables in a interface are final variables
    void set_ph();               //similar to abstract class methods cannot be defined in the interface class
    default void say_hello()    //by using default keyword we can define a method in interface
    {
        System.out.println("hello!");
    }
}
