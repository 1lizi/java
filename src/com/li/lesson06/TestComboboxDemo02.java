package com.li.lesson06;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class TestComboboxDemo02 extends JFrame {
    public TestComboboxDemo02(){

        Container container = this.getContentPane();

        //生成列表的内容 稀疏数组，压缩数据
        //String[] contents = {"1","2","3"};//静态

        Vector<Object> contents = new Vector();//也可以放动态的变量
        //列表中需要放入内容
        JList jList = new JList(contents);

        contents.add("张三");
        contents.add("栗子");
        contents.add("杨桃");

        container.add(jList);

        this.setVisible(true);
        this.setSize(500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestComboboxDemo02();

    }
}

