package Geeks_For_Geeks;

public class object_class_getname {

    public class A
    {
        public int b=10;
    }


    public static void main(String[] argc)
    {
        object_class_getname o=new object_class_getname();
        A obj=o.new A();
        System.out.println(obj.getClass());  //would return the name of the class either user defined or inbuild like -String
        Object s;  //Object class is directly or indirectly associated with every class therefore it can be used to create
        // an object
        s=1;
        System.out.println(s.getClass()); //in this case the class is object and the value assigned to that object is an integer so this would print the data type
        Object s2=1;
        System.out.println(s2.equals(s));
        Object s3="aman nawal";
        System.out.println(s3+"  :: "+s3.getClass().getName());

    }
}
