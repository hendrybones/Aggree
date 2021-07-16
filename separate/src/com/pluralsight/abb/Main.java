package com.pluralsight.abb;
import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame("separate ");
        frame.setLayout(new GridLayout(0,1));
        JLabel label1=new JLabel("below separation");
        frame.add(label1);
        JSeparator sep=new JSeparator();
        frame.add(sep);
        JLabel label2=new JLabel("above separation");
        frame.add(label2);
        frame.setSize(400,100);
        frame.setVisible(true);



    }
}
