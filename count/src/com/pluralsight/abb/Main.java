package com.pluralsight.abb;
import javax.swing.*;
import java.awt.event.*;


public class Main  implements ActionListener{
    JLabel label1,label2;
    JTextArea area;
    JButton b;

    Main(){
        JFrame frame=new JFrame("word count");

        label1=new JLabel();
        label1.setBounds(50,25,100,30);

        label2=new JLabel();
        label2.setBounds(160,25,100,30);

        area=new JTextArea();
        area.setBounds(20,75,250,200);

        b=new JButton("count words");
        b.setBounds(100,300,120,30);
        b.addActionListener(this);
        frame.add(label1);
        frame.add(label2);
        frame.add(area);
        frame.add(b);
        frame.setSize(450,4590);
        frame.setVisible(true);
        frame.setLayout(null);


    }

    public static void main(String[] args) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
