package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(400,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //创建一些组件
        ImageIcon logn=new ImageIcon("image/logn.jpg");
        logn.setImage(logn.getImage().getScaledInstance(152,80,Image.SCALE_DEFAULT));
        JLabel img=new JLabel(logn);
        JLabel label1=new JLabel("user:");
        JLabel label2=new JLabel(("password:"));
        JTextField field1=new JTextField(15);
        JPasswordField field2=new JPasswordField(15);
        JButton button1=new JButton("submit");
        JButton button2=new JButton("cancel");
        //创建表格
        GridBagLayout layout=new GridBagLayout();
        GridBagConstraints c=null;
        JPanel panel=new JPanel(layout);
        //第一行
        c=new GridBagConstraints();
        c.gridheight=2;
        c.gridwidth=1;
        c.fill=GridBagConstraints.BOTH;
        layout.setConstraints(img,c);
        panel.add(img);

        c=new GridBagConstraints();
        c.gridwidth=1;
        c.insets=new Insets(0,10,0,10);
        c.anchor=GridBagConstraints.EAST;
        layout.setConstraints(label1,c);
        panel.add(label1);

        c=new GridBagConstraints();
        c.gridwidth=0;
        c.fill=GridBagConstraints.HORIZONTAL;
        layout.setConstraints(field1,c);
        panel.add(field1);
        //第二行
        c=new GridBagConstraints();
        c.gridwidth=1;
        c.insets=new Insets(0,10,0,10);
        c.anchor=GridBagConstraints.EAST;
        layout.setConstraints(label2,c);
        panel.add(label2);

        c=new GridBagConstraints();
        c.gridwidth=0;
        c.fill=GridBagConstraints.HORIZONTAL;
        layout.setConstraints(field2,c);
        panel.add(field2);

        //第三行
        c=new GridBagConstraints();
        c.gridwidth=1;
        c.gridx=2;
        layout.setConstraints(button1,c);
        panel.add(button1);

        c=new GridBagConstraints();
        c.gridwidth=0;
        layout.setConstraints(button2,c);
        panel.add(button2);


        frame.add(panel);
        frame.setVisible(true);

        //错误提示
//        StringBuffer str1=new StringBuffer("");
//        StringBuffer str2=new StringBuffer("");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str1=new String(field1.getText());
                System.out.println(str1);
                String str2=new String(field2.getText());
                System.out.println(str2);
                if(str1.equals("zyw")&&str2.equals("123")){
                    JOptionPane.showMessageDialog(null,"successful");
                }else{
                    JOptionPane.showMessageDialog(null,"wrong");
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText("");
                field2.setText("");
            }
        });
    }
}
