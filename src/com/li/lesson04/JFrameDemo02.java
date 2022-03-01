package com.li.lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo02 {
    public static void main(String[] args) {
        new MyJframe2().init();
    }
}
 //构造器
class MyJframe2 extends JFrame{
    public void init(){
        this.setVisible(true);
        this.setBounds(10,10,200,200);
        //设置文字Jlabel
        JLabel label = new JLabel("这是一个测试",SwingConstants.CENTER);

        //让文本标签居中，设置水平对齐
        //label.setHorizontalAlignment(SwingConstants.CENTER);
        //关闭事件



        this.add(label);
        //获得一个容器，容器里的颜色才是真正的颜色
        Container container = this.getContentPane();
        container.setBackground(Color.pink);


    }
}
