package com.li.lesson01;

import java.awt.*;

public class MyFrame extends Frame {
    static int id = 0;//可能存在多个窗口，需要一个计数器

    public MyFrame(int x, int y, int w, int h, Color color) {
        super("MyFrame+" + (++id));
        setBackground(color);
        setBounds(x, y, w, h);
        setVisible(true);

    }

    public MyFrame() {

    }
}
