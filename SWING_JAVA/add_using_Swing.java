package SWING_JAVA;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class add extends JFrame implements ActionListener   //in order to add an action to our button we have to implement
//ActionListener interface
{
  public   JTextField t1;
   public JTextField t2;
   public JLabel r1;
   public JButton b;

    public void actionPerformed(ActionEvent ae)   //is a abstract method used to implement or Listener
    {
        Integer num=Integer.parseInt(t1.getText());
        Integer num2=Integer.parseInt(t2.getText());
        Integer val=num+num2;
        r1.setText(val+" ");
    }

    public add()
    {
        setLayout(new FlowLayout());  //set layout is used to pick number of layouts which are available on our swing
        //flow layout is used to arrange the component ont by one

         t1=new JFormattedTextField(23);  //JTextField is a component that allows editing of a single line of text
        //basically it creates a block which can be edited by the user
       t1.setSize(230,30);
         t2=new JFormattedTextField(23);
         b=new JButton("ok");

         r1=new JLabel();
         setSize(500,500);
        r1.setText("result");
        b.addActionListener(this);  //add Action listener is used to enter a listener to our button
        //addActionListener would take an object As parameter

        add(t1);     //all JButton,JLabel,JTextField needs to be added to out program
        add(t2);
        add(b);
        add(r1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


}
public class add_using_Swing {
public static void main(String[] args)
{
    new add();
}
}
