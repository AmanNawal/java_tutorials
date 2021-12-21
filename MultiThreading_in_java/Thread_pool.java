package MultiThreading_in_java;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


// A thread pool reuses previously created threads to execute current tasks and offers a solution to the problem
// a normal thread can get executed one time when its started but after completing its execution it terminates
// so in order to compensate this we create a thread pool which consists of number of threads and these threads can
// work on multiple methods until and unless terminate instruction is not being called

//the drawback of using single threads is that it uses more resources to create a single thread rather than to execute
// the actual code
//creating multiple single threads again and again would put a great pressure on our cpu resources
//so its better to use a single thread pool in order to multitask in a large application

class PoolThread implements Runnable
{
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println(i+"---->"+Thread.currentThread());
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                e.getStackTrace();
            }
        }
        System.out.println(Thread.currentThread()+":  finished");
    }
}

public class Thread_pool {

    public static void main(String[] args)
    {
        PoolThread r1=new PoolThread();
        PoolThread r2=new PoolThread();
        PoolThread r3=new PoolThread();
        PoolThread r4=new PoolThread();
        PoolThread r5=new PoolThread();
        PoolThread r6=new PoolThread();
        ExecutorService pool= Executors.newFixedThreadPool(5);    //3 are basically the number of threads being created
        pool.execute(r1);                                                            // in our thread pool
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);      //all pool execute are the instructions to execute the runnable
                                    // class by different threads in our thread pool
        pool.execute(r5);
        pool.execute(r6);
        pool.execute(r3);
        pool.shutdown();
    }
}
