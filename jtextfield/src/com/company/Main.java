package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(400,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel=new JPanel();
        JLabel label=new JLabel("请输入信息");
        JTextField text=new JTextField(10);
        text.setFont(new Font("宋体",Font.BOLD,12));
        text.setHorizontalAlignment(JTextField.CENTER);
        text.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override


            public void keyReleased(KeyEvent e) {
                label.setText(text.getText());
            }
        });
        JButton btn=new JButton("提交");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,text.getText());
            }
        });
        panel.add(label);
        panel.add(text);
        panel.add(btn);
        frame.add(panel);
        frame.setVisible(true);
    }
}
