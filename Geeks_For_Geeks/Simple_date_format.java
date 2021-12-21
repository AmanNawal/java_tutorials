package Geeks_For_Geeks;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Date_check
{
    public void Find_date()
    {

    }
}

public class Simple_date_format {

    public static void main(String[] argc) throws ParseException
    {
        SimpleDateFormat date=new SimpleDateFormat("dd-MM-yyyy");  //Simpledateformat is a class which will intake time from our system
        //in the form of parametrised pattern
        System.out.println((new Date()));    //date() is a class always initiated by new for provoking it would returns
                                            // the date moth time year and day in the form of a string
        System.out.println(date.format(new Date()));    //date.format() is being used to print the date
        // in the pattern provided by us earlier in the code

        date=new SimpleDateFormat("dd-MM-yyyy");    //statement is being used to create another pattern

        Date date1= date.parse("11-12-2000");     //date.parse is used to change the date provided above
        System.out.println(date.format(date1));

    }

}
