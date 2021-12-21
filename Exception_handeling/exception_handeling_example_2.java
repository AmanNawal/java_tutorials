package Exception_handeling;

public class exception_handeling_example_2 {

    public static void main(String[] arg) throws Exception //is a keyword that is used for suppress the error in java
            //it won,t handel the error it would just suppress the error
    {
        StringBuffer str = new StringBuffer();
    int k=0;
    try {
        if (k == 0) {
            throw new ArithmeticException();    //THROWING EXCEPTION ACCORDING TO OUR OWN WILL
        }
    }
   catch (ArithmeticException exception)
   {
       System.out.println("value of k must not be 0");
   }
    }

}
