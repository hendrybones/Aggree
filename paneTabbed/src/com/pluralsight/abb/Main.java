package com.pluralsight.abb;
import javax.swing.*;


public class Main {
    JFrame frame;

    Main(){
        frame=new JFrame();
        JTextArea area=new JTextArea(200,200);
        JPanel p1=new JPanel();
        p1.add(area);

        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JTabbedPane tp= new JTabbedPane();
        tp.setBounds(50,50,200,200);
        tp.add("main",p1);
        tp.add("visit",p2);
        tp.add("help",p3);
        frame.add(tp);
        frame.setSize(400,200);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Main();

    }
}
