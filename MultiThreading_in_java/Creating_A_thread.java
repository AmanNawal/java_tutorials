package MultiThreading_in_java;
 // A thread is a unit(task) of a big Task



class FirstThread extends Thread
{
public void run()
{
    System.out.println("first thread doing its task!");
}
}

class ThreadTwo extends Thread
{
    public void run() {
        try {

        for (int i=0;i<5;i++)
        { Thread.sleep(2000);                           //is used for sleeping 1000=1 sec
            System.out.println("thread 2 is working fine!");
        }
        }
        catch (Exception e)
        {

        }
        }
}

public class Creating_A_thread {

    static public void main(String [] args)     //main methods has a thread within itself that means that every task
    // done by  without declaring other threads are done by main method default thread
    {
        System.out.println("\nApplication started\n");
        FirstThread t1=new FirstThread();
        ThreadTwo t2=new ThreadTwo();
        t1.start();
        t2.start();
        System.out.println("\nApplication finished\n");
    }
}
