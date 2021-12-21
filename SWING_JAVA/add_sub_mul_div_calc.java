package SWING_JAVA;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class add_sub_mul_div_calc {
    public static void main(String[] args)
    {

        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        JTextField t1=new JFormattedTextField(0);
        JTextField t2=new JFormattedTextField(0);

        t1.setPreferredSize(new Dimension(100,30));
        t2.setPreferredSize(new Dimension(100,30));
        JButton b1 =new JButton("+");
        JButton b2=new JButton("-");
        JButton b3=new JButton("X");
        JButton b4=new JButton("/");
        frame.setSize(500,600);
        JButton l=new JButton("result");
        l.setPreferredSize(new Dimension(100,40));
        ActionListener list=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Long one,two,sum;
                one=Long.parseLong(t1.getText().replaceAll(",",""));
                two=Long.parseLong(t2.getText().replaceAll(",",""));
                sum=one+two;
                l.setText(sum.toString());

            }
        };

        ActionListener list2=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 Integer f,s,sub;

                     f = Integer.parseInt(t1.getText().replaceAll(",",""));
                     s=Integer.parseInt(t2.getText().replaceAll(",",""));
                     sub = f - s;
                     l.setText(sub.toString());
                 }
        };


        ActionListener list3=new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Integer fir,sec,mul;
                fir=Integer.parseInt(t1.getText().replaceAll(",",""));
                sec=Integer.parseInt(t2.getText().replaceAll(",",""));
                mul=fir*sec;
                l.setText(mul.toString());
            }
    };

        ActionListener list4=new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Integer o,t,div;
                o=Integer.parseInt(t1.getText().replaceAll(",",""));
                t=Integer.parseInt(t2.getText().replaceAll(",",""));
                try
                {
                    if(t==0)
                        l.setText("number cannot be divide by zero");

                    div=o/t;
                    l.setText(div.toString());
                }
                catch (ArithmeticException ee)
                {

                }
            }
        };

        b1.addActionListener(list);
        b2.addActionListener(list2);
        b3.addActionListener(list3);
        b4.addActionListener(list4);
        frame.add(t1);
        frame.add(t2);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(l);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
}
