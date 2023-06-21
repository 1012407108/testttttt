package com.itheima.son;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Mjfram extends JFrame implements KeyListener {
    int[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    //0号元素坐标
    int row;
    int column;
    int count = 0;
    //胜利标准
    int[][] win = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    public Mjfram() {
        //窗体对象.addKeyListener(KeyListener实现类对象)
        this.addKeyListener(this);
        //初始化窗体
        initFrame();
        //初始化数据
        intiData();
        //绘制游戏画面
        paintView();
        //设置窗体可见
        setVisible(true);
    }


    /**
     *
     */
    /**
     * 窗体初始化
     */
    public void initFrame() {
        //设置窗口大小
        setSize(514, 595);
        //设置窗口关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗体标题
        setTitle("女孩子拼图游戏最终版");
        //设置窗体置顶
        setAlwaysOnTop(true);
        //设置窗体剧中
        setLocationRelativeTo(null);
        //取消默认布局
        setLayout(null);


    }

    /**
     * 此方法用于绘制游戏界面
     */
    public void paintView() {


//        JLabel background = new JLabel(new ImageIcon("D:\\image\\0.jpg"));
//        background.setBounds(26,30,450,484);
//        getContentPane().add(background);
        getContentPane().removeAll();
        if (victory()) {
            JLabel winLabel = new JLabel(new ImageIcon("d:\\image\\0.jpg"));
            winLabel.setBounds(10, 10, 490, 580);
            getContentPane().add(winLabel);
        }
        //重新游戏
        JLabel btn = new JLabel("重启游戏");
        btn.setBounds(350, 20, 100, 20);
        getContentPane().add(btn);
        btn.setFocusable(false);
        btn.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent event) {

            }

            @Override
            public void ancestorRemoved(AncestorEvent event) {

            }

            @Override
            public void ancestorMoved(AncestorEvent event) {

            }
        });
        //步数
        JLabel scoreLable = new JLabel("步数为:" + count);
        scoreLable.setBounds(50, 20, 100, 20);
        getContentPane().add(scoreLable);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JLabel imageLabel = new JLabel(new ImageIcon("d:\\image\\" + data[i][j] + ".png"));
                imageLabel.setBounds(10 + 160 * j, 20 + 160 * i, 160, 160);
                getContentPane().add(imageLabel);
            }
            getContentPane().repaint();


        }
    }

    /**
     * 初始化数据
     */
    public void intiData() {
        //准备Random对象
        Random r = new Random();
        //遍历二维数组,获取到每一个元素
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                int X = r.nextInt(3);
                int Y = r.nextInt(3);
                int temp = data[i][j];
                data[i][j] = data[X][Y];
                data[X][Y] = temp;
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == 9) {
                    row = i;
                    column = j;
                }
            }
        }
    }


    @Override
    public void keyPressed(KeyEvent e) {

        int keyCode = e.getKeyCode();

        move(keyCode);
        //每一次移动之后都要重新加载界面
        paintView();
    }

    /**
     * 此方法用于处理移动业务
     *
     * @param keyCode
     */
    private void move(int keyCode) {

        if (victory()) return;
        if (keyCode == 37) {

            if (column == 2) return;
            int temp = data[row][column];
            data[row][column] = data[row][column + 1];
            data[row][column + 1] = temp;
            column++;
            count++;
        } else if (keyCode == 38) {
            if (row == 2) return;
            int temp = data[row][column];
            data[row][column] = data[row + 1][column];
            data[row + 1][column] = temp;
            row++;
            count++;
        } else if (keyCode == 39) {
            if (column == 0) return;
            int temp = data[row][column];
            data[row][column] = data[row][column - 1];
            data[row][column - 1] = temp;
            column--;
            count++;
        } else if (keyCode == 40) {
            if (row == 0) return;
            int temp = data[row][column];
            data[row][column] = data[row - 1][column];
            data[row - 1][column] = temp;
            row--;
            count++;
        } else if (keyCode == 90) {
            //作弊触发器
            data = new int[][]{
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
        }
    }

    /**
     * 判断胜利
     *
     * @return
     */
    public boolean victory() {

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }

        }
        return true;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
