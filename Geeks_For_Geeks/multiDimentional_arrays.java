package Geeks_For_Geeks;

import java.util.Scanner;

public class multiDimentional_arrays {
   static Scanner scan=new Scanner(System.in);
    public static void main(String[]a)
    {
        int [][]arr=new int[3][3];
        System.out.println("enter elements to the array");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[][] arr2={{1,2,3},{4,5,6},{7,8,9}};  //initializing 3d array

        System.out.println("\nAlready initialized array:");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }


    }
}
