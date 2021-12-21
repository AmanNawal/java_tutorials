package SWING_JAVA.BORDER_LAYOUT;

import javax.swing.*;
import java.awt.*;


//BorederLayout() is used to place components at fie major areas NORTH,SOUTH,EAST,WEST,CENTER
//Our JFrame is In borderLayout() By default

public class a_basics {

    public static void main(String [] args)
    {
        JFrame frame=new JFrame();
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10,10));              //setting layout as BorderLayout
       // BorderLayout instance can have parameter that can be initiated to add seperation between multiple onjects


        JPanel panel1=new JPanel();
        panel1.setBackground(Color.black);
        panel1.setPreferredSize(new Dimension(200,200));
        frame.add(panel1,BorderLayout.NORTH);




        JPanel panel2=new JPanel();
        panel2.setBackground(Color.BLUE);
        panel2.setPreferredSize(new Dimension(200,200));
        frame.add(panel2,BorderLayout.SOUTH);


        JPanel panel3=new JPanel();
        panel3.setPreferredSize(new Dimension(200,200));
        panel3.setBackground(Color.yellow);
        frame.add(panel3,BorderLayout.CENTER);


        //adding sub_panels to a panel

        panel3.setLayout(new BorderLayout(5,5));   //making panel3 as a layout itself so it can store some object within itself


        JLabel label=new JLabel("CYKA BLYAT",SwingConstants.CENTER);
        label.setForeground(Color.DARK_GRAY);
        label.setFont(new Font("Jokerman",Font.BOLD,40));

        panel3.add(label,BorderLayout.CENTER);     //adding a JLable to the center of our panel


        JPanel panel4=new JPanel();   //adding a sub-panel to a already created panel3
        panel4.setPreferredSize(new Dimension(100,100));
        panel4.setBackground(Color.cyan);
        panel3.add(panel4,BorderLayout.EAST);


        frame.setResizable(false);

        frame.setVisible(true);



    }
}
