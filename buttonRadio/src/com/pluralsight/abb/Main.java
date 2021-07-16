package com.pluralsight.abb;
import javax.swing.*;
import java.awt.event.*;


public class Main extends JFrame implements ActionListener{
    JRadioButton but1,but2;
    JButton b;

    Main(){
        but1=new JRadioButton("male");
        but1.setBounds(100,50,100,30);
        but2=new JRadioButton("female");
        but2.setBounds(100,100,100,20);

        ButtonGroup bg=new ButtonGroup();
        bg.add(but1);
        bg.add(but2);

        b=new JButton("click");
        b.setBounds(100,150,80,30);
        b.addActionListener(this);
        add(but1);
        add(but2);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (but1.isSelected()){
            JOptionPane.showMessageDialog(this,"your male");
        }
        if (but2.isSelected()){
            JOptionPane.showMessageDialog(this,"your female");
        }

    }

    public static void main(String[] args) {
        new Main();

    }


}
