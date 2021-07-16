package com.pluralsight.abb;
import javax.swing.*;
import java.awt.event.*;

public class Main implements ActionListener {
    JFrame f;
    JMenuBar mb;
    JMenu file,edit,help;
    JMenuItem cut,copy,paste,selectAll;
    JTextArea text;

    Main(){
        f=new JFrame();

        //declering items to be selected
        cut=new JMenuItem("CUT");
        copy=new JMenuItem("COPY");
        paste=new JMenuItem("paste");
        selectAll=new JMenuItem("selectALL");

        // add actionlistener to the items
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        //declearing items on a bar

        mb=new JMenuBar();
        file=new JMenu("FIle");
        edit=new JMenu("Edit");
        help=new JMenu("Help");

        //setting itemlist under edit

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        //adding items under menubar

        mb.add(file);
        mb.add(edit);
        mb.add(help);

        text=new JTextArea();
        text.setBounds(5,5,360,320);
        f.add(mb);
        f.add(text);
        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cut){
            text.cut();
        }
        if (e.getSource()==copy){
            text.copy();
        }
        if (e.getSource()==paste){
            text.paste();
        }
        if (e.getSource()==selectAll){
            text.selectAll();
        }

    }

    public static void main(String[] args) {
        new Main();

    }


}
