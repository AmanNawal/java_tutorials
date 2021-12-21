package SWING_JAVA;
import javax.swing.*;
import java.awt.*;


class Child extends JFrame   //by inheriting JFrame you can create you own class for creating frames
{
    public Child()    //a constructor used for creating the frame
    {
        this.setSize(1300,720);
        this.getContentPane().setBackground(Color.BLACK);
        this.setResizable(false);
        ImageIcon image=new ImageIcon("D:\\computer science\\src\\1049956.jpg");
        this.setIconImage(image.getImage());
        this.setTitle("child class frame");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE );
        this.setVisible(true);
    }
}

public class creating_a_frame_by_the_help_of_chile_class {
public static void main(String[] args)
{
    new Child();          //since child class is inheriting JFrame class the method available in JFrame are also available for pur child class
}
}


