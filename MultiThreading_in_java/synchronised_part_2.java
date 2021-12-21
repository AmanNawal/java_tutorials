package MultiThreading_in_java;

import java.util.Arrays;

class  non_Synchronised extends Thread
{
    public  void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println("count-->" + i);
            }
        }
    }
}

public class synchronised_part_2 {
    public static void main(String[] args)
    {
       non_Synchronised yes=new non_Synchronised();
       non_Synchronised no=new non_Synchronised();
       yes.start();
       no.start();



    }
}
