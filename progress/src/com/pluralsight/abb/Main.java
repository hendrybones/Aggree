package com.pluralsight.abb;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Main {
    JFrame frame;

    Main(){
        frame=new JFrame();
        DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
        DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");
        style.add(color);
        style.add(font);

        DefaultMutableTreeNode red=new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode blue=new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode green=new DefaultMutableTreeNode("black");
        DefaultMutableTreeNode black=new DefaultMutableTreeNode("Black");

        DefaultMutableTreeNode five=new DefaultMutableTreeNode("Five");

        color.add(red);
        color.add(blue);
        color.add(green);
        color.add(black);
        font.add(five);

        JTree tree=new JTree(style);
        frame.add(tree);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
	new Main();
    }
}
