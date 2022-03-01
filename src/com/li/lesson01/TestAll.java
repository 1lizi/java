package com.li.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestAll {
    public static void main(String[] args){
        //总的窗口Frame
        Frame frame = new Frame();

        frame.setSize(400,300);
        frame.setLocation(300,400);
        frame.setBackground(Color.gray);
        frame.setVisible(true);


        //表格布局
        frame.setLayout(new GridLayout(2,1));

        //4个面板
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2,1));
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2,2));
        // 上部分
        p1.add(new Button("East-1"),BorderLayout.EAST);
        p1.add(new Button("West-1"),BorderLayout.WEST);

        p2.add(new Button("p2-btn-1"));
        p2.add(new Button("p2-btn-2"));

        p1.add(p2,BorderLayout.CENTER);

        //下部分
        p3.add(new Button("East-2"),BorderLayout.EAST);
        p3.add(new Button("West-2"),BorderLayout.WEST);

        //下部分的中间4个
        for (int i = 0; i < 4; i++) {
            p4.add(new Button("for-" + i));
        }

            p3.add(p4,BorderLayout.CENTER);

            frame.add(p1);
            frame.add(p3);

            //监听关闭窗口

            frame.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }

            });
        }

    }

