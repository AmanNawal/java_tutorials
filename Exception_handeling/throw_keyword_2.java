package Exception_handeling;

import java.util.Scanner;

public class throw_keyword_2 {
    static Scanner scan=new Scanner(System.in);
    public static void main(String []argc)
    {
        int divide,divisor;
        divide=scan.nextInt();
        divisor=scan.nextInt();
        try
        {
            if(divisor<0)
            {
                throw new ArithmeticException();
            }
            if(divisor==0)
            {
                throw new Exception("ERRRRROORRRR");
            }
        }
        catch (ArithmeticException exception)
        {
            System.out.println("please enter positive integers");
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}


