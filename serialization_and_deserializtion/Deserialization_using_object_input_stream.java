package serialization_and_deserializtion;
//in order to deserialize a bin file we use ObjectInput stream
import java.io.*;

public class Deserialization_using_object_input_stream extends Object_output_stream.aman{

    public static void main(String[] argc) throws FileNotFoundException,IOException,ClassNotFoundException
    {
        FileInputStream in=new FileInputStream(new File("D:\\computer science\\src\\File_Handeling\\first_bin.bin"));
        //object input stream would take file input stream as input so we need to create one first
        ObjectInputStream input=new ObjectInputStream(in);

        Object_output_stream.aman ob=(Object_output_stream.aman)input.readObject(); //readObject() is being used to read the
        //data from the .bin file is being transferred to the object of same type but firstly it needs to get typec asted
        System.out.println(ob.age+" "+ob.sem+" "+ob.name);
    }
}
