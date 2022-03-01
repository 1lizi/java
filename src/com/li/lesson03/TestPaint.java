package com.li.lesson03;

import java.awt.*;

public class TestPaint {
    public static void main(String[] args) {
    new MyPaint().loadFrame();
    }
}
class MyPaint extends Frame {
    public void loadFrame(){
        setBounds(200,200,600,500);
        setVisible(true);
    }

//画笔
    @Override
    public void paint(Graphics g) {
       // super.paint(g);
        //画笔需要有颜色  可以画画
        g.setColor(Color.red);
        g.drawOval(100,100,100,100);
        g.fillOval(100,100,100,100);//实心圆

        g.setColor(Color.GREEN);
        g.fillRect(150,200,200,200);
        //画笔用完，要还原到最初的颜色。
    }
}