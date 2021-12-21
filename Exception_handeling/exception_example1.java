//there are two types of exceptions
//1)checked exception
//            1) I/O exception   2)SQL exception
//2)unchecked exception
//             1)runtime exception


package Exception_handeling;

public class exception_example1 {

    public static void main(String []argc)
    {
        int arr[]=new int[2];
        try {
            arr[2]=100;      //array limit is upto arr[1] not [2]
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Entered data exceeds the array limits");
        }
        finally {
            System.out.println("Finally the out of index bounds exception has been removed");
        }

    }
}
