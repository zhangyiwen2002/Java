package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame("test");
        frame.setSize(400,300);
        frame.setLocation(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        JButton button1=new JButton("up");
        JButton button2=new JButton("down");
        JButton button3=new JButton("left");
        JButton button4=new JButton("right");
        JButton button5=new JButton("center");
        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);
        frame.add(button3,BorderLayout.WEST);
        frame.add(button4,BorderLayout.EAST);
        frame.add(button5,BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
