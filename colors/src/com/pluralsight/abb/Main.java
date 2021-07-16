package com.pluralsight.abb;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JFrame frame;
    JButton b;
    JTextArea area;

    Main(){
        frame=new JFrame("change color");

        b=new JButton("Pad color");
        b.setBounds(200,250,100,30);
        area=new JTextArea();
        area.setBounds(10,10,300,200);

        b.addActionListener(this);
        frame.add(b);
        frame.add(area);
        frame.setLayout(null);
        frame.setSize(400,100);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Color c=JColorChooser.showDialog(this,"choose",Color.CYAN);
        area.setBackground(c);

    }

    public static void main(String[] args) {
        new Main();

    }


}
