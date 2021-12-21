package ARRAY_LIST_DATA_STRUCTURE;
import java.util.*;

class Student
{
    private String name;
    private Integer roll_number,sem;
    public Student(String name_student,Integer roll_student,Integer semester)
    {
        this.name=name_student;
        this.roll_number=roll_student;
        this.sem=semester;

    }

    public void display()
    {
        System.out.println("Student Name:  "+this.name+"\nStudent roll number:  "+this.roll_number+"\nStudent's semester:  "+this.sem);

    }
}




public class customised_array_list {
static Scanner scan=new Scanner(System.in);

static public void main(String[] argument)
{
ArrayList<Student> stu=new ArrayList<>(5);
    System.out.println("enter name:  rollno:  sem");
    String name_student;
    Integer roll_student;
    Integer semester;
for (int i=0;i<5;i++)
{
    name_student=scan.nextLine();
    roll_student= scan.nextInt();
    semester=scan.nextInt();
    scan.nextLine();
    stu.add(new Student(name_student,roll_student,semester));
}
for (int i=0;i<5;i++)
{
stu.get(i).display();

}
}

}

