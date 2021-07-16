package com.pluralsight.abb;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    JTextField field1,field2,field3;
    JButton b1,b2;

    Main(){
        JFrame frame=new JFrame();
        field1=new JTextField();
        field1.setBounds(50,50,150,20);

        field2=new JTextField();
        field2.setBounds(50,100,150,20);

        field3=new JTextField();
        field3.setBounds(50,150,150,20);
        field3.setEditable(false);

        b1=new JButton("+");
        b1.setBounds(50,200,50,50);

        b2=new JButton("-");
        b2.setBounds(120,200,50,50);

        b1.addActionListener(this);
        b2.addActionListener(this);

        frame.add(field1);
        frame.add(field2);
        frame.add(field3);
        frame.add(b1);
        frame.add(b2);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1=field1.getText();
        String s2=field2.getText();

        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;

        if(e.getSource()==b1){
            c=a+b;

        }else if (e.getSource()==b2){
            c=a-b;
        }
        String results=String.valueOf(c);
        field3.setText(results);

    }
}
