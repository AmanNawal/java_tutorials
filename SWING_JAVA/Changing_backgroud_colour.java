package SWING_JAVA;
import javax.swing.*;
import java.awt.*;

public class Changing_backgroud_colour {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setSize(1300,720);
        ImageIcon image=new ImageIcon("D:\\computer science\\src\\649995.jpg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.BLACK);//is used to set our background colour
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
