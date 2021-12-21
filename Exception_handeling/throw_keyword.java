package Exception_handeling;

public class throw_keyword {

    public static void main(String argc[])
    {
            try {
                int a = 50;
                int b = 0;
                if (b == 0) {
                    throw new Exception("divide by zero");  //throw new is being used to customise the exception according to the user like"cannot divide by zero"
                }
            int c=a/b;
                System.out.println("resullt" + c);
            }
            catch(Exception e)  //would get the divide by zero exception
            {
                System.out.println("exception is :: "+e);
            }
    }
}
