package Geeks_For_Geeks;

import java.util.Scanner;

public class jagged_class_example {
    static Scanner scan=new Scanner(System.in);

public static void main(String []a)
{
    System.out.println("Enter the number of rows in the jagged array:\n");
    int rows= scan.nextInt();
    scan.nextLine();
    int [][]jugged_array=new int[rows][];  //jagged array initialization rows
    for (int i=0;i<rows;i++)
    {
        System.out.println("Enter number of coloumns for row["+i+"]   :");
        int coloumns=scan.nextInt();
        jugged_array[i]=new int[coloumns];   //each row has to initiated with coloumns creating coloumns for different rows
        scan.nextLine();
        System.out.println("ENTER DATA FOR ROW "+i+"  :");
        for (int j=0;j<coloumns;j++)
        {
            jugged_array[i][j]=scan.nextInt();
        }
    }
    System.out.println("Elements of jugged_array are:");
    for (int i=0;i<rows;i++)
    {
        System.out.print("ROW["+i+"]-> ");
        for(int j=0;j< jugged_array[i].length;j++)
        {
            System.out.print(jugged_array[i][j]+" ");
        }
        System.out.println();
    }


}
}
