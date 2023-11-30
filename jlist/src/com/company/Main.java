package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame("test");
        frame.setSize(400,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar=new JMenuBar();
        frame.setJMenuBar(menuBar);
        JMenu filemenu =new JMenu("file");
        JMenu testmenu=new JMenu("test");

    }
}
