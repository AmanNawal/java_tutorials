package MultiThreading_in_java;

class join extends Thread
{
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("yes "+i);
        }
    }
}
public class join_in_java {
static public void main(String[] args) throws InterruptedException
{
    join jo=new join();
    jo.start();
    System.out.println(jo.isAlive());//would check that the thread is in runnable state or not
    jo.join();                //join method would not execute our main thread until and unless all the threads return
                                                 //after completing their task the main thread would be executed
    System.out.println(jo.isAlive());    //it would print false because thread has been eliminated
    System.out.println("bye");
}
}
