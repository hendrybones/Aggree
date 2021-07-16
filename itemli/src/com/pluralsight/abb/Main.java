package com.pluralsight.abb;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    Main(){
        JFrame frame=new JFrame("item listener");
        final JLabel label=new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);

        JCheckBox box1=new JCheckBox("C++");
        box1.setBounds(150,100,50,30);

        JCheckBox box2=new JCheckBox("java");
        box2.setBounds(150,150,50,50);
        frame.add(label);
        frame.add(box1);
        frame.add(box2);


        box1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ CheckBox"
                +(e.getStateChange()==1? "checked":"unchecked"));
            }
        });
        box2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("java checkBox"
                +(e.getStateChange()==1?"checked":"unchecked"));
            }
        });

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(400,400);
    }

    public static void main(String[] args) {
        new Main();

    }
}
