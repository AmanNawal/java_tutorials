package MultiThreading_in_java;

public class main_thread {

    //when a java program starts up a thread begins running immediately (main thread)
    //main thread is the one which executes our program
    //main thread is the thread from which other threads are spawned
    //and it's also the last thread to finish execution

    static public void main(String[] args)
    {
       Thread main_thread=new Thread();
        System.out.println(main_thread.getName());    //get name method is used to get the name of the thread
        main_thread.setName("first thread");   //set name() method is used to set the name of the thread
        System.out.println(main_thread.getName());
        System.out.println(Thread.currentThread().getName());    //currentThread() is used to get the reference of the main thread

        Thread t_main=Thread.currentThread();          //creating a instance of main thread
        System.out.println(t_main.getPriority());
    }
}
