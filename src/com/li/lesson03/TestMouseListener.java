package com.li.lesson03;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//鼠标监听事件
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}

//自己的类
class MyFrame extends Frame{
    //画画需要画笔，需要监听鼠标当前的位置，需要集合来存储这个点
    ArrayList points;
     //构造器
    public MyFrame(String title) {
        super(title);//super: 代表父类对象的应用，可以调用父类的title构造方法，给窗体添加title
        setBounds(200, 200, 400, 400);
        //存鼠标点击产生的点
        points=new ArrayList<>();

        setVisible(true);
        //鼠标监听器，正对这个窗口
        this.addMouseListener(new MyMouseListener());
    }
    //将points中点画出来
    @Override
    public void paint(Graphics g) {
        //画画，监听鼠标事件
        Iterator iterator=points.iterator();//迭代器  （即循环）集合中的点
        while (iterator.hasNext()) { //取出List中的点
            Point point=(Point)iterator.next(); //指向下一个点
            g.setColor(Color.green);
            g.fillOval(point.x, point.y, 10, 10);
        }
    }
    //添加一个点到界面上面
    public void addPaint(Point point) {
        points.add(point);
    }
    //适配器模式
    private class MyMouseListener extends MouseAdapter {
        //鼠标按下，弹起，按住不放
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame myFrame=(MyFrame)e.getSource();
            //点击的时候，界面上产生一个点
            myFrame.addPaint(new Point(e.getX(),e.getY()));
            //每次点击鼠标都需要重画一遍
            myFrame.repaint();
        }
    }




}
