package MultiThreading_in_java;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

// A semaphore class can actually control the number of threads accessing a resource at an instance of time
//an object of semaphore can be created and initialized with a parameter (num) num is the number of threads
//accessing the block of code a until and unless a thread completes its execution the resource would be locked for num threads only
//after completion the next thread can access the resource



class SemnaphoreExample implements Runnable
{
    public Semaphore sem;
    public SemnaphoreExample(Semaphore sem)
    {
        this.sem=sem;
    }

    public void run()
    {
        try {
            sem.acquire();         //acquire method checks the number of permits acquired by threads in current block
            for (int i=0;i<3;i++)
            {
                System.out.println(i+":-->"+Thread.currentThread());
            }
            System.out.println("completed-->"+Thread.currentThread());
            Thread.sleep(1000);

        }
        catch (Exception e)
        {
            System.out.println(e.getStackTrace());
        }
        finally {
            sem.release();     //this method is used to release a thread after its execution is completed
            //after releasing the permit tend to increase(i.e. another waiting thread can start executing)
        }

    }
}


public class SemaPhore_in_JAVA {

    static public void main(String[] args) {
        Semaphore sem = new Semaphore(2);  //creating a semaphore instance that would allow only two threads at an instance
        ExecutorService pool= Executors.newFixedThreadPool(3);    //creating a thread pool
        SemnaphoreExample o1=new SemnaphoreExample(sem);
        SemnaphoreExample o2=new SemnaphoreExample(sem);
        SemnaphoreExample o3=new SemnaphoreExample(sem);
        SemnaphoreExample o4=new SemnaphoreExample(sem);
        SemnaphoreExample o5=new SemnaphoreExample(sem);
        pool.execute(o1);
        pool.execute(o2);                      //executing each thread
        pool.execute(o3);
        pool.execute(o4);
        pool.execute(o5);
        pool.shutdown();

    }
}
