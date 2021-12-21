package Geeks_For_Geeks;

import java.util.Scanner;

class Student
{
    static Scanner scan=new Scanner(System.in);
    private String Student_name;
    private long phone_no;
    public void Set_student()
    {
        System.out.println("Enter the name of the students:\n");
        this.Student_name=scan.nextLine();
        System.out.println("Enter the phone number");
        this.phone_no=scan.nextLong();
        scan.nextLine();
    }
    public void display()
    {
        System.out.println("NAME: "+this.Student_name+" PHONE NUMBER: "+this.phone_no);
    }

}


public class array_of_user_defined_class extends Student
{
    public static void main(String[] a)
    {
        int number_of_students=3;
        Student[] st;
        st=new Student[number_of_students];  //creating an array of class student
        for (int i=0;i<number_of_students;i++)
        {
            st[i]=new Student();           //every index of the array consists of an object so the objects present
            // indexes needs to be created by using new keyword for each index
            st[i].Set_student();
        }
        System.out.println("The data entered by the students is:");
        for (Student s:st)
        {
            s.display();
        }
    }

}
