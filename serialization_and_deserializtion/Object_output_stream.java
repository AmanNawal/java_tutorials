package serialization_and_deserializtion;

import java.io.*;
import java.util.Scanner;

//serialisation is achieved by objectOutputstream is used to create .bin file that can be used to read data in different
//systems
public class Object_output_stream {
static Scanner scan=new Scanner(System.in);
    static class aman implements Serializable   //in order to tell JVM that a class is serializable it should implement it
{
    public int age,sem;
    public String name;

    public aman()
    {
        this.age=scan.nextInt();
        this.sem=scan.nextInt();
        scan.nextLine();
        this.name=scan.nextLine();
    }
}

static public void main(String []argc) throws IOException
{
    aman o=new aman();
    File file=new File("D:\\computer science\\src\\File_Handeling\\first_bin.bin");
    FileOutputStream out=new FileOutputStream(file);       //ObjectOutputstream takes fileouputstream as parameter
    ObjectOutputStream write=new ObjectOutputStream(out);
    write.writeObject(o);   //passing object of class aman so that age and sem can be written in the .bin file
    write.close();
}

}
