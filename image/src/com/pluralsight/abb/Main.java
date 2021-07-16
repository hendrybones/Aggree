package com.pluralsight.abb;
import javax.swing.*;

public class Main {
    Main(){
        JFrame frame=new JFrame("image button");
        JButton b=new JButton(new ImageIcon("F:\\test\\icon.png"));
        b.setBounds(100,100,100,40);
        frame.add(b);
        frame.setSize(300,400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new  Main();

    }
}
