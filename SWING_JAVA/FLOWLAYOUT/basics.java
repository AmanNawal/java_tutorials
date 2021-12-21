package SWING_JAVA.FLOWLAYOUT;


import javax.swing.*;
import java.awt.*;

//FlowLayout is used to place components ina row,One by one
public class basics {
    static class Flow extends JFrame
    {
        Flow()
        {
            setLayout(new FlowLayout(FlowLayout.CENTER,10,10));      //setting the horizontal seperation adn vertical seperation
            setSize(600,600);

            add(new JButton("OK 1"));
            add(new JButton("OK 2"));
            add(new JButton("OK 3"));
            add(new JButton("OK 4"));
            add(new JButton("OK 5"));
            add(new JButton("OK 6"));
            add(new JButton("OK 7"));


            JPanel panel=new JPanel();
            panel.setPreferredSize(new Dimension(250,300));
            panel.setBackground(Color.RED);
            add(panel);

            //setting up panel as a layout upon which we can place some GUI objects

            //all the buttons being added to the panel would be inside of our panel
            panel.setLayout(new FlowLayout());
            panel.add(new JButton("L"));
            panel.add(new JButton("L"));
            panel.add(new JButton("L"));
            panel.add(new JButton("L"));
            panel.add(new JButton("L"));
            panel.add(new JButton("L"));



            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }
    }


    public static void main(String [] args)
    {
        new Flow();

    }
}
