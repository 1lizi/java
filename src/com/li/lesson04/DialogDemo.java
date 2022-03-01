package com.li.lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//主窗口
public class DialogDemo extends JFrame {

    public DialogDemo() {//构造器
        this.setVisible(true);
        //this.setSize(700,500);
        this.setBounds(100,100,700,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //JFrame 放东西，需要一个容器
        Container container = this.getContentPane();
        //绝对布局
        container.setLayout(null);

        //按钮  将弹窗弹出来
        JButton button = new JButton("点击弹出一个对话框");//创建对象
        button.setBounds(30,30,200,50);

        //点击这个按钮的时候，弹出一个弹窗, 这里就需要一个监听器去赋予按钮这个功能
        button.addActionListener(new ActionListener() {  //监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                //弹窗
                new MyDialogDemo();//需要使用只需要new一个对象

            }
        });
        container.add(button);//容器里面加入按钮
    }

    public static void main(String[] args) {
        new DialogDemo();

    }

}

//弹窗的窗口
class MyDialogDemo extends JDialog{
    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(100,100,500,500);
        //this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// 里面自带了，所以这个是多余的

        Container container = this.getContentPane();
        container.setLayout(null);

        container.add(new Label("学习Java"));

    }
}

