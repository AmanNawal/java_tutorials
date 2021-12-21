package Geeks_For_Geeks;

public class printing_Buffstring_charat {

    public static void main(String []ar)
    {
        StringBuffer str=new StringBuffer("aman nawal");
        System.out.println("without deleting the string!\n");
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }

        System.out.println("by the means of deleting the string!\n");
        int len=str.length();
        for (int j=0;j<len;j++)
        {
            System.out.println(str.charAt(0));
            str.deleteCharAt(0);
        }

        if(str.isEmpty()==true)
        {
            System.out.println("BufferString is now empty-\n");
        }
        else
            System.out.println("not empty!");
    }
}
