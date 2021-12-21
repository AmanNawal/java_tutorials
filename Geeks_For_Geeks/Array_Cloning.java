package Geeks_For_Geeks;

public class Array_Cloning {

    public static void main(String []a)
    {
        int []arr={1,2,3};
        int []arr3=arr.clone();    //deep copy
        int [][]arr2={{1,2,3},{4,5,6}};  //shallow copy
        int [][]arr4=arr2.clone();
        for (int i:arr3)
        {
            System.out.print(i+" ");
        }

        System.out.println("\n\n");
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        }

    }
}
