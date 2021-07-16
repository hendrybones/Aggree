package com.pluralsight.abb;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JLabel label;
    JCheckBox box1,box2,box3;
    JButton b;

    Main(){
        label=new JLabel("food ordering");
        label.setBounds(50,50,300,20);

        box1=new JCheckBox("pizza @ 100");
        box1.setBounds(100,100,150,20);

        box2=new JCheckBox("Burger @ 30");
        box2.setBounds(100,150,150,20);

        box3=new JCheckBox("Tea @ 10");
        box3.setBounds(100,200,150,20);

        b=new JButton("order");
        b.setBounds(100,250,80,30);
        b.addActionListener(this);
        add(label);
        add(box1);
        add(box2);
        add(box3);
        add(b);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        float amount=0;
        String msg="";
        if(box1.isSelected()){
            amount+=100;
            msg +="pizza: 100 \n";
        }
        if (box2.isSelected()){
            amount+=30;
            msg +="burger: 30 \n";
        }
        if (box3.isSelected()){
            amount+=10;
            msg +="Tea: 10 \n";
        }
        msg+="-------------\n";
        JOptionPane.showMessageDialog(this,msg + "Total" +amount);

    }

    public static void main(String[] args) {
        new Main();

    }


}
