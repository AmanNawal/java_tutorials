package Geeks_For_Geeks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.*;
import java.lang.*;
import java.io.*;

// A class to represent a student.
class Student1
{
    int rollno;
    String name, address;

    // Constructor
    public Student1(int rollno, String name,
                   String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name +
                " " + this.address;
    }
}

class Sortbyroll implements Comparator<Student1>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student1 a, Student1 b)
    {
        return a.rollno - b.rollno;
    }
}

class Sortbyname implements Comparator<Student1>
{
    // Used for sorting in ascending order of
    // name
    public int compare(Student1 a, Student1 b)
    {
        return a.name.compareTo(b.name);
    }
}

// Driver class
class Rough
{
    public static void main (String[] args)
    {
        ArrayList<Student1> ar = new ArrayList<Student1>();
        ar.add(new Student1(111, "bbbb", "london"));
        ar.add(new Student1(131, "aaaa", "nyc"));
        ar.add(new Student1(121, "cccc", "jaipur"));

        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyroll());

        System.out.println("\nSorted by rollno");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyname());

        System.out.println("\nSorted by name");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
    }
}
