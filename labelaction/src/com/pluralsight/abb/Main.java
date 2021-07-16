package com.pluralsight.abb;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.UnknownHostException;

public class Main extends Frame implements ActionListener{
    JTextField text;
    JLabel label;
    JButton b;

    //contractor class of main
    Main(){
        text=new JTextField();
        text.setBounds(50,50,150,20);

        label=new JLabel();
        label.setBounds(50,100,250,20);

        b=new JButton("FIND IP");
        b.setBounds(50,150,95,30);

        b.addActionListener(this);
        add(b);add(text);add(label);
        setSize(400,400);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        text.setText("welcome again");

        try {

            String host=text.getText();
            String ip=java.net.InetAddress.getByName(host).getHostAddress();
            label.setText("IP of "+ host + "is" +ip );


        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
    public static void main(String[] args) {
        new Main();

    }
}
