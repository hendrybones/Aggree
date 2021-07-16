package com.pluralsight.abb;
import javax.swing.*;

public class Main {
    JFrame f;
    Main(){
        f=new JFrame();
        String name=JOptionPane.showInputDialog(f,"enter your name");
    }

    public static void main(String[] args) {
        new Main();


    }
}
