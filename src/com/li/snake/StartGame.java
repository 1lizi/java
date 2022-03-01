package com.li.snake;

import javax.swing.*;

//游戏的主启动类
public class StartGame {
    public static void main(String[] args) {
        //首先设置一个窗口
        JFrame frame = new JFrame();

        frame.setBounds(10,10,900,720);
        frame.setResizable(false);//窗口大小不变
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭窗口
        //正常的游戏界面都应该在面板上
        frame.add(new GamePanel());
        frame.setVisible(true);//可视化

    }
}

