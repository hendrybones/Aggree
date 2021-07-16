package com.pluralsight.abb;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main  {
    JFrame frame;


    Main(){
        frame=new JFrame("comboBox");
        final JLabel label=new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);

        JButton b=new JButton("show");
        b.setBounds(200,100,75,20);

        String languages[]={"C","C++","C#","java","PHP"};
        final JComboBox comb =new JComboBox(languages);
        comb.setBounds(50,100,90,20);

        frame.add(label);
        frame.add(b);
        frame.add(comb);
        frame.setLayout(null);
        frame.setSize(350,350);
        frame.setVisible(true);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data="programing languages;"
                        +comb.getItemAt(comb.getSelectedIndex());
                label.setText(data);
            }
        });




    }

    public static void main(String[] args) {
	new Main();
    }


}
