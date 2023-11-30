package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame("test");
        frame.setSize(500,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //创建一些组件
        JButton btn1=new JButton("open");
        JButton btn2=new JButton("save");
        JButton btn3=new JButton("exit");
        String[] str={"java","c#","html","css","js"};
        JComboBox choose=new JComboBox(str);
        JTextField text=new JTextField(10);
        JButton btn4=new JButton("clear");
        JList list=new JList(str);
        JScrollPane panel1=new JScrollPane(list);
        panel1.setPreferredSize(new Dimension(80,60));
        JTextArea textArea=new JTextArea(3,10);
        textArea.setBackground(Color.green);
        JScrollPane pannel2=new JScrollPane(textArea);
        //创建表格
        GridBagLayout layout=new GridBagLayout();
        JPanel panel=new JPanel(layout);
        GridBagConstraints s=null;
        //第一行三个按钮
        s=new GridBagConstraints();
        s.gridwidth=1;
        layout.setConstraints(btn1,s);
        panel.add(btn1);
        s=new GridBagConstraints();
        s.gridwidth=1;
        layout.setConstraints(btn2,s);
        panel.add(btn2);
        s=new GridBagConstraints();
        s.gridwidth=0;
        s.anchor=GridBagConstraints.WEST;
        layout.setConstraints(btn3,s);
        panel.add(btn3);
        //第二行三个组件
        s=new GridBagConstraints();
        s.gridwidth=2;
        s.fill=GridBagConstraints.HORIZONTAL;
        layout.setConstraints(choose,s);
        panel.add(choose);

        s=new GridBagConstraints();
        s.gridwidth=1;
        layout.setConstraints(text,s);
        panel.add(text);

        s=new GridBagConstraints();
        s.gridwidth=0;
        layout.setConstraints(btn4,s);
        panel.add(btn4);
        //第三行两个组件
        s=new GridBagConstraints();
        s.gridwidth=2;
        s.gridheight=2;
        s.fill=GridBagConstraints.BOTH;
        layout.setConstraints(panel1,s);
        panel.add(panel1);

        s=new GridBagConstraints();
        s.gridwidth=2;
        s.gridheight=2;
        s.fill=GridBagConstraints.BOTH;
        layout.setConstraints(pannel2,s);
        panel.add(pannel2);

        frame.add(panel);
        frame.setVisible(true);
    }
}
