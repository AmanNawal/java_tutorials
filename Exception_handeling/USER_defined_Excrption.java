package Exception_handeling;

class Student extends Exception
{
    public Student(String stu)
    {
        super(stu);

    }
}

public class USER_defined_Excrption {

static public void main(String[] argc)
{
    try
    {
        throw new Student("aman nawal");
    }
    catch (Student e)
    {
        System.out.println(e);
        System.out.println(e.getMessage());
    }
}
}
