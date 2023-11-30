package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame("test");
        frame.setSize(400,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] data=new String[]{"请选择省","湖北","湖南"};
        JComboBox province=new JComboBox(data);
        JComboBox city=new JComboBox();
        city.setPreferredSize(new Dimension(100,25));

        JPanel panel=new JPanel();
        panel.add(province);
        panel.add(city);

        province.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                int index=province.getSelectedIndex();
                switch (index){
                    case 0:
                        city.removeAllItems();
                        break;
                    case 1:
                        city.removeAllItems();
                        city.addItem("武汉");
                        city.addItem("孝感");
                        break;
                    case 2:
                        city.removeAllItems();
                        city.addItem("长沙");
                        city.addItem("常德");
                        break;
                }
            }
        });
        frame.add(panel);
        frame.setVisible(true);
    }
}
