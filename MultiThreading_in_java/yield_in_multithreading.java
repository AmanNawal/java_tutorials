package MultiThreading_in_java;

class yield_run implements Runnable
{
    public void run() {

        for (int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class yield_in_multithreading
{
public static void main(String[] args) throws Exception
{
    yield_run run=new yield_run();
    Thread th=new Thread(run);
    th.start();

    th.join();
    System.out.println("bye");

}

}
