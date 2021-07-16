package com.pluralsight.abb;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*;


public class Main {


    public static void main(String[] args) {
        JFrame frame=new JFrame("creating table with values");
        String data[][]={{"101","hendry","67000"},
                {"102","jai","7800"},
                {"103","sachin","70,000"}};
        String column[]={"ID","NAME","SALARY"};
        final JTable table=new JTable(data,column);
        table.setCellSelectionEnabled(true);
        ListSelectionModel select=table.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        select.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String Data=null;
                int[]row=table.getSelectedRows();
                int[]columns=table.getSelectedColumns();
                for (int i=0; i<row.length; i++){
                    for (int j=0; j<columns.length;j++){
                        Data=(String) table.getValueAt(row[i],columns[j]);
                    }
                }
                System.out.println("table element selected is;" +Data);
            }
        });
        JScrollPane pane=new JScrollPane(table);
        frame.add(pane);
        frame.setSize(300,200);
        frame.setVisible(true);


    }
}
