package com.itheima.test;

import javax.swing.*;

public class TuPian {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        //设置窗体大小
        frame.setSize(514, 595);
        //设置窗体关闭模式
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗体标题
        frame.setTitle("美女图片拼图");
        //设置窗体置顶
        frame.setAlwaysOnTop(true);
        //设置窗体居中
        frame.setLocationRelativeTo(null);


        //取消默认布局
        frame.setLayout(null);

        for (int j = 0;j<4;j++) {
            for (int i = 0;i<4;i++) {
                JLabel jl1 = new JLabel(new ImageIcon("D:\\image\\1.jpg"));
                jl1.setBounds(50+100*i, 90+100*j, 100, 100);
                frame.getContentPane().add(jl1);
            }
        }

        JLabel background = new JLabel(new ImageIcon("D:\\image\\1.jpg"));
        background.setBounds(26, 30, 450, 484);
        frame.getContentPane().add(background);


        //设置窗体可见
        frame.setVisible(true);
    }
}
