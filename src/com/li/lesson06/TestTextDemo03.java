package com.li.lesson06;

import javax.swing.*;
import java.awt.*;

public class TestTextDemo03 extends JFrame {

    public TestTextDemo03(){
        Container container = this.getContentPane();

        //文本域 配合面板使用
        JTextArea textArea = new JTextArea(20,50);
        textArea.setText("文本域的测试");

        //Scroll面板
        JScrollPane scrollPane = new JScrollPane(textArea);
        container.add(scrollPane);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(400,350);
    }

    public static void main(String[] args) {
        new TestTextDemo03();
    }
}
