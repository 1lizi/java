package com.li.lesson01;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args){
        //展示多个弹窗 new
        MyFrame myFrame1 = new MyFrame(100,100,200,200,Color.orange);
        MyFrame myFrame2 = new MyFrame(300,100,200,200,Color.gray);
        MyFrame myFrame3 = new MyFrame(100,300,200,200,Color.green);
        MyFrame myFrame4 = new MyFrame(300,300,200,200,Color.pink);

    }
}
