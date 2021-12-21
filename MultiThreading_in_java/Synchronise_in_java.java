package MultiThreading_in_java;

import java.util.Vector;


class for_number
{
    public void print()                     //synchronized keyword allows only one thread to access the code
                                                          //while the others are waiting outside
    {
        synchronized (this) {
            for (int i = 0; i < 5; i++)                  //it can be used directly by implementing synchronized keyword
                                                              //in front of our method definition
            {
                System.out.println("catch-->" + i);       //+ it a synchronous block can be created by using synchronous
                                                             // keyword along with a parameter(object)
            }
        }
    }
}

class synchronise_ex implements Runnable
{
    private for_number o;
    public synchronise_ex(for_number obj)
    {
        this.o=obj;
    }

    public  void run()
    {
            o.print();

    }
}

public class Synchronise_in_java {
    static public void main(String[] args) throws Exception
    {    for_number num=new for_number();
        Thread thread1=new Thread(new synchronise_ex(num),"Thread1");
         thread1.setPriority(Thread.MAX_PRIORITY);
        Thread Thread2=new Thread(new synchronise_ex(num),"Thread2");
        thread1.start();
        Thread2.start();
        thread1.join();
        Thread2.join();
        System.out.println("byr bye");


    }
}
