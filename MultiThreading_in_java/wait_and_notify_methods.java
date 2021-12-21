package MultiThreading_in_java;


import java.util.Scanner;

class yes_yes
{
    static Scanner scan=new Scanner(System.in);
    public void method_1() throws InterruptedException
    {
      //  synchronized (this)
        //{
            System.out.println(Thread.currentThread()+" is gonna wait");
            wait();                                                        //wait() method tells a thread to lock this block and go to sleep
                            // until and unless a new thread notifies this thread
            System.out.println(Thread.currentThread()+" resumed");

        //}
    }
    public void method_2()
    {
        synchronized (this)
        {
            System.out.println("press 1 to resume the other thread");
           Integer var=scan.nextInt();
            if (var==1)
            {
                System.out.println("KEY PRESSED!");
                notifyAll();                                //notify all is being used to notify the threads inside our method_1 function


            }

        }

    }
}




public class wait_and_notify_methods {

static public void main(String [] args) throws Exception
{
    yes_yes no=new yes_yes();
    Thread thread1=new Thread(new Runnable() {
        @Override
        public void run() {
            try {

                no.method_1();
            }
        catch (Exception e)
        {

        }
        }
    });

    Thread thread3=new Thread(new Runnable() {
        @Override
        public void run() {
            try
            {
                no.method_1();
            }
            catch (Exception e)
            {

            }

        }
    });

    Thread thread2=new Thread(new Runnable() {
        @Override
        public void run() {
       no.method_2();
        }
    });
thread1.start();
thread3.start();
thread2.start();

thread1.join();
thread2.join();
    System.out.println("joined");
    System.out.println("bye!");


}

}
