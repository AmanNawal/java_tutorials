package Geeks_For_Geeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Different_ways_to_input_in_java {

    public static void main(String[]a) throws IOException
    {
        System.out.println("using buffered reader!\n");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String i= reader.readLine();
        System.out.println(i);
        /*System.out.println("\n\nusing Scanner class!");
        Scanner scan=new Scanner(System.in);
        int in=scan.nextInt();
        System.out.println(in);

        System.out.println("\n\nBy using console class::");  //console class does not work in non interactive Environment IDE
        String name=System.console().readLine();
        System.out.println(name);*/
    }
}
