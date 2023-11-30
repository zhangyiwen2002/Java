package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("测试");
        frame.setSize(400, 300);
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1=new JPanel(); //面板1，默认流式布局
        p1.add(new JButton("登录"));
        p1.add(new JButton("注册"));
        p1.add(new JButton("找回密码"));
        JPanel p2=new JPanel(); //面板2，默认流式布局
        p2.add(new JTextField("用户名",20));
        p2.add(new JTextField("密码",20));
        JPanel cardPanel = new JPanel( new CardLayout() ); //创建使用card布局的面板
        cardPanel.add( p1, "card1" ); //在card布局面板中添加面板1,并设置卡片名称
        cardPanel.add( p2, "card2" ); //在card布局面板中添加面板2,并设置卡片名称
// 先显示第1个card
        CardLayout layout = (CardLayout) ( cardPanel.getLayout() ); //获得cardPanel容器的布局
        layout.show(cardPanel,"card1"); //调用show()方法显示面板1
        frame.add(cardPanel); //将card布局的面板放到窗口中
        frame.setVisible(true);
// 每间隔2秒切换显示下一个card（循环）
        new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.next( cardPanel );
            }
        }).start();

    }
}
