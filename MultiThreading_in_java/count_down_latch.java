package MultiThreading_in_java;


//CountDownLatch is used to make a task(thread) wait fow other threads before it starts
//IT AIN,T WORKING

import java.util.concurrent.*;

class student_example extends Thread
{
  public   CountDownLatch latch;
    public student_example(CountDownLatch l)
    {
        this.latch=l;
    }
    public void run()
    {
        for (int i=0;i<3;i++)
        {
            System.out.println(i+"-->"+Thread.currentThread());
        }
        System.out.println(Thread.currentThread()+"-->finished");


    }
}

public class count_down_latch {
    public static void main(String[] args) {
        CountDownLatch obj = new CountDownLatch(3);

        student_example o1 = new student_example(obj);
        student_example o2 = new student_example(obj);
        student_example o3 = new student_example(obj);
        student_example o4 = new student_example(obj);
        student_example o5 = new student_example(obj);
        student_example o6=new student_example(obj);
        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();
        o6.start();
        try
        {
            obj.await();
            System.out.println("await completed");
            System.out.println("khatam");
        }
        catch (Exception e)
        {
            System.out.println(e.getStackTrace());
        }






    }
}
