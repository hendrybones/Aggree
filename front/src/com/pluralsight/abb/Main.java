package com.pluralsight.abb;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("my first java swing program");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);


    }

    public static void placeComponents(JPanel panel) {
        panel.setLayout(null);
// creating label
        JLabel userLabel = new JLabel("user");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);


        //creating textField
        JTextField field = new JTextField(20);
        field.setBounds(100, 20, 165, 25);
        panel.add(field);

        //creating password
        JPasswordField password = new JPasswordField(20);
        password.setBounds(100, 50, 165, 25);
        panel.add(password);

        //creating login button
        JButton button=new JButton("login");
        button.setBounds(10,80,80,25);
        panel.add(button);

    }
}