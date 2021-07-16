package com.pluralsight.abb;
import javax.swing.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
	JFrame frame=new JFrame("password area");
	final JLabel label=new JLabel();
	label.setBounds(20,150,200,50);

	final JPasswordField value=new JPasswordField();
	value.setBounds(100,75,100,30);

	JLabel label1=new JLabel("username");
	label1.setBounds(20,20,80,30);

	JLabel label2=new JLabel("password");
	label2.setBounds(20,75,80,30);
	JButton b=new JButton("login");
	b.setBounds(100,120,80,30);

	final JTextField text=new JTextField();
	text.setBounds(100,20,100,30);
	frame.add(value);

	frame.add(label1);
	frame.add(label);
	frame.add(label2);
	frame.add(b);
	frame.add(text);
	frame.setVisible(true);
	frame.setLayout(null);
	frame.setSize(300,300);
	b.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			String data="username" + text.getText();
			data +=",password";+ new String(value.getPassword());
			label.setText(data);
		}
	});

    }
}
