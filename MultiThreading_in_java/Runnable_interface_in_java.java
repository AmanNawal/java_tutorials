package MultiThreading_in_java;

import com.code.Main;

class Run1 implements Runnable
{
   public void run()
    {
        try {


            for (int i=0;i<5;i++)
            {
                Thread.sleep(1000);
                System.out.println("aman"+i);
            }
        }
        catch (Exception e)
        {

        }
    }
}

class Run2 implements Runnable {
    public void run() {
        try {


            for (int i=0;i<5;i++)
            {
                Thread.sleep(1000);
                System.out.println("nawal"+i);
            }
        }
catch (Exception e)
{

}
    }
}

public class Runnable_interface_in_java {

    public static void main(String[] args) throws Exception
    {
        Thread.sleep(3000);
        Run1 r1=new Run1();                         //when using Runnable interface we need to create a thread class
        Run2 r2=new Run2();
        Thread th1=new Thread(r1);            //passing our class implementing runnable interface
        Thread th2=new Thread(r2);
        th1.start();
        th2.start();

    }
}
