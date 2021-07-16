package com.pluralsight.abb;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    Main(){
        JFrame frame=new JFrame(" list of item");
        final JLabel label=new JLabel();
        label.setSize(500,100);

        JButton b=new JButton("show");
        b.setBounds(200,150,80,30);

        final DefaultListModel<String> l1=new DefaultListModel<>();
        l1.addElement("C");
        l1.addElement("C++");
        l1.addElement("JAva");

        final JList<String> list1=new JList<>(l1);
        list1.setBounds(100,100,75,75);
        DefaultListModel<String> l2=new DefaultListModel<>();
       l2.addElement("C");
       l2.addElement("C++");
       l2.addElement("JAVA");
       l2.addElement("PHP");

       final JList<String>list2=new JList<>(l2);
       list2.setBounds(100,200,75,75);
       frame.add(list1);
       frame.add(list2);
       frame.add(b);
       frame.add(label);
       frame.setSize(450,450);
       frame.setLayout(null);
       frame.setVisible(true);
       b.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String data="";
           if (list1.getSelectedIndex()!=-1){
               data="programing language selected" +list1.getSelectedValue();
               label.setText(data);
           }
           if (list2.getSelectedIndex()!=-1){
               data +=",framework selected";
               for (Object frame :list2.getSelectedValues()){
                   data +=frame +"";
               }
           }
           label.setText(data);


           }
       });

    }

    public static void main(String[] args) {
        new Main();

    }
}
