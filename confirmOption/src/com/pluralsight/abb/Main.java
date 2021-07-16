package com.pluralsight.abb;
import javax.swing.*;
import java.awt.event.*;

public class Main extends  WindowAdapter {
    JFrame f;
    Main(){
        f=new JFrame("confirm dialog");
        f.addWindowListener(this);
        f.setSize(300,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
    }
    public void windowClosing(WindowEvent e) {
        int a = JOptionPane.showConfirmDialog(f, "Are you sure?");
        if (a == JOptionPane.YES_OPTION) {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

        public static void main(String[] args) {
        new Main();


    }
}
