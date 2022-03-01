package com.li.lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {

    //int(); 初始化
    public  void init(){
        JFrame jf = new JFrame("这是一个JFrame 窗口");
        jf.setVisible(true);
        jf.setBounds(100,100,200,200);
        jf.setBackground(Color.cyan);
        //设置文字 Jlabel

        JLabel label = new JLabel("这里是一个小测试",SwingConstants.CENTER);

        jf.add(label);



        //关闭事件
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        //建立一个窗口
        new JFrameDemo().init();
    }
}
