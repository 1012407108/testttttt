package com.itheima.jframee;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消窗体默认布局
        frame.setLayout(null);


        //展示按钮
        JButton btn = new JButton("按钮");
        btn.setBounds(200, 200, 100, 100);
        frame.getContentPane().add(btn);

        //创建事件
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //一旦鼠标或者空格点了,就会输出,要解除空格焦点锁定,需要写一句代码:btn.setFocusable(false);
                System.out.println("我被点了");
            }
        });
        btn.setFocusable(false);


        btn.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //有些Esc输入不了,所以不用这个方法
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //键盘按住就有了
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //键盘松开就有了

            }
        });
        frame.setVisible(true);
    }
}
