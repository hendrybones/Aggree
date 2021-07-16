package com.pluralsight.abb;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame("check box");
        JCheckBox box1=new JCheckBox("C++");
        box1.setBounds(100,100,50,50);

        JCheckBox box2=new JCheckBox("java", true);
        box2.setBounds(100,150,50,50);

        frame.add(box1);
        frame.add(box2);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);





    }
}
