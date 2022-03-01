package com.li.lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {
    //先拥有一个构造器  再构造一个main方法
    public ImageIconDemo() {
        //获取图片的地址
        JLabel label = new JLabel("ImageIcon");//将图片放在标签里
        URL url = ImageIconDemo.class.getResource("壁纸01.jpg");

        ImageIcon imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);//居中显示

        Container container = getContentPane();
        container.add(label);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,200,200);
    }

    public static void main(String[] args) {
        new ImageIconDemo();

    }
}
