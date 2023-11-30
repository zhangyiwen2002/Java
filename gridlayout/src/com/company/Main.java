package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame("test");
        frame.setSize(400,300);
        frame.setLocation(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel=new JPanel(new GridLayout(4,4,5,5));
        jPanel.add(new JButton("7"));
        jPanel.add(new JButton("8"));
        jPanel.add(new JButton("9"));
        jPanel.add(new JButton("/"));
        jPanel.add(new JButton("4"));
        jPanel.add(new JButton("5"));
        jPanel.add(new JButton("6"));
        jPanel.add(new JButton("*"));
        jPanel.add(new JButton("1"));
        jPanel.add(new JButton("2"));
        jPanel.add(new JButton("3"));
        jPanel.add(new JButton("-"));
        jPanel.add(new JButton("0"));
        jPanel.add(new JButton("."));
        jPanel.add(new JButton("复位"));
        jPanel.add(new JButton("+"));
        JPanel panel2=new JPanel();
        panel2.add(new JLabel("运算结果:"));
        panel2.add(new JTextField(20));
        frame.add(panel2,BorderLayout.NORTH);
        frame.add(jPanel,BorderLayout.CENTER);

        frame.setVisible(true);

    }
}
