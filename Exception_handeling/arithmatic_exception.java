package Exception_handeling;

public class arithmatic_exception {
    public static void main(String[] argc)
    {
        Integer []arr={100,200};
        try{
            System.out.println(2/0);
            arr[100]=300;}                     // would try the conditions coded in the block
        catch (ArithmeticException exception)             // would catch any type of exception mentioned by user
        {
            System.out.println("printing arithmatic exception" + exception.getMessage());
        }
        catch (NullPointerException exception)    //multiple catch methods being used
        {
            System.out.println(exception.getMessage());  //getMessage() is used to print the exception
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("array out of index exception!\n");
        }

        catch (Exception e)          //is used to catch all the others exceptions just like an else statement works
        {                              //exception is the base class of all the exception
            System.out.println("catching all the exceptions here");     //it is know as generic exception handler
        }
        finally {                                      //would run no matter what if try is true or false
            System.out.println("finally the block is running");
        }
        System.out.println("aman nawal");
    }
}
