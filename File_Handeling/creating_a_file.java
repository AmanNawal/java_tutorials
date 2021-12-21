package File_Handeling;

import java.io.File;
import java.io.IOException;

public class creating_a_file {

    public static void main(String[] argc)
    {
        File file=new File("D:\\computer science\\src\\File_handeling\\firstfile.txt");
        try
        {
            if(file.createNewFile())
            {
                System.out.println("file created "+file.getName());
            }
            else
                System.out.println("file already exists!");
        }

        catch (IOException e)
        {
            System.out.println("error in creating a txt file");
        }

        if(file.exists())
        {
            System.out.println("file name: "+file.getName()+" \nfile path: "+file.getAbsolutePath()+
                    "\nFile is writable: "+file.canWrite()+" \nFile is readable: "+file.canRead()+" \nsizeof file: "+file.length());
        }

    }
}
