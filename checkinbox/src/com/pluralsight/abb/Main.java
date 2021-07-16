package com.pluralsight.abb;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main {


    public static void main(String[] args) {
        JFrame frame=new JFrame("check box inside menuItem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar mb=new JMenuBar();
        //file menu f-mnemonic

        JMenuItem fileMenu=new JMenuItem("file");
        fileMenu.setMnemonic(KeyEvent.VK_C);
        mb.add(fileMenu);

        // File->New, N - Mnemonic
        JMenuitem menuItem1=new JMenuItem()


    }
}
