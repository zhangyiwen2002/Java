package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame("test");
        frame.setSize(600,300);
        frame.setLocation(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn1=new JButton("btn1");
        JButton btn2=new JButton("btn2");
        JButton btn3=new JButton("btn3");
        JButton btn4=new JButton("btn4");
        JButton btn5=new JButton("btn5");
        Box hbox01=Box.createHorizontalBox();
        hbox01.add(btn1);
        hbox01.add(btn2);
        hbox01.add(Box.createHorizontalGlue());
        hbox01.add(btn3);
        hbox01.add(Box.createHorizontalStrut(20));
        Box vbox01=Box.createVerticalBox();
        vbox01.add(btn4);
        vbox01.add(Box.createVerticalStrut(50));
        vbox01.add(btn5);
        Box hbox02=Box.createHorizontalBox();
        Box hbox=Box.createHorizontalBox();
        hbox.add(hbox01);
        hbox.add(vbox01);
        frame.add(hbox);
        frame.setVisible(true);
    }
}
