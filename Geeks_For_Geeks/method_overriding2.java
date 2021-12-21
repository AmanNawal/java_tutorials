package Geeks_For_Geeks;

public class method_overriding2 extends method_overridig{
    public void display()
    {
        String gender="male";
        System.out.println(gender);
        super.display();
    }
    public static void main(String [] a)
    {
        method_overridig obj=new method_overridig();
        method_overridig obj2=new method_overriding2();
        method_overridig ref;  //ref is an object of base class type
        ref=obj;      //initialising ref by passing the value of already initialised obj
        ref.display();    //ref is now capable of calling the base display function
       ref=obj2;
        System.out.println("this is the sub-class:");
       ref.display();   //after initialising ref with obj2 it executes the sub-class method display()
        //this shows that the type of object being used will determine which method to be executed during run time
    }
}
