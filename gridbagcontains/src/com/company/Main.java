package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame("test");
        frame.setSize(600,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton[] btns=new JButton[10];
        for (int i = 0; i < 10; i++) {
            btns[i]=new JButton("btn"+i);
        }
        GridBagLayout layout=new GridBagLayout();
        JPanel panel=new JPanel(layout);
        GridBagConstraints c=null;
        for (int i = 0; i < 3; i++) {
            c=new GridBagConstraints();
            if(i<2){
                c.gridwidth=1;
            }else{
                c.gridwidth=0;
            }

            layout.setConstraints(btns[i],c);
            panel.add(btns[i]);
        }
        c=new GridBagConstraints();
        c.gridwidth=0;
        c.fill=GridBagConstraints.HORIZONTAL;
        layout.setConstraints(btns[4],c);
        panel.add(btns[4]);
        c=new GridBagConstraints();
        c.gridwidth=3;
        c.fill=GridBagConstraints.HORIZONTAL;
        layout.setConstraints(btns[5],c);
        panel.add(btns[5]);
        c=new GridBagConstraints();
        c.gridwidth=0;
        c.fill=GridBagConstraints.HORIZONTAL;
        layout.setConstraints(btns[6],c);
        panel.add(btns[6]);
        c=new GridBagConstraints();
        c.gridwidth=2;
        c.gridheight=2;
        c.fill=GridBagConstraints.BOTH;
        layout.setConstraints(btns[7],c);
        panel.add(btns[7]);
        c=new GridBagConstraints();
        c.gridwidth=0;
        c.fill=GridBagConstraints.HORIZONTAL;
        layout.setConstraints(btns[8],c);
        panel.add(btns[8]);
        c=new GridBagConstraints();
        c.gridwidth=0;
        c.gridx=3;
        c.fill=GridBagConstraints.HORIZONTAL;
        layout.setConstraints(btns[9],c);
        panel.add(btns[9]);
        frame.add(panel);
        frame.setVisible(true);
    }
}
