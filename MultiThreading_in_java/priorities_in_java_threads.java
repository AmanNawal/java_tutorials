package MultiThreading_in_java;

//priorities in threads would decide that which thread will get execution first
//suppose t1(1),t2(7),t3(2)   t2 would be executed first because of it's priority

class Thread_Priority implements Runnable
{
    public synchronized void run()
    {

        Thread t=Thread.currentThread();
        try {
           synchronized (this) {
               System.out.println("yes: " + Thread.currentThread());   //thread.current thread is being used to reference
           }                                    // to the thread which is currently accessing to this block of code

        }
        catch (Exception e)
        {

        }
    }
}
public class priorities_in_java_threads {
public static void main(String[]args) throws Exception
{

    Thread_Priority ta=new Thread_Priority();
    Thread t1=new Thread(ta);
    t1.setName("Thread 1");
    t1.setPriority(2);
    Thread_Priority tb=new Thread_Priority();
    Thread t2=new Thread(tb);
    t2.setName("Thread 2");
    t2.setPriority(Thread.MAX_PRIORITY);

    Thread_Priority tc=new Thread_Priority();
    Thread t3=new Thread(tc);
    t3.setName("Thread 3");
    t3.setPriority(4);

    t2.start();
    t1.start();
    t3.start();



}

}
