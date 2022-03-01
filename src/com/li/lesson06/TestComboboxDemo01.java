package com.li.lesson06;

import javax.swing.*;
import java.awt.*;

public class TestComboboxDemo01 extends JFrame {
    public TestComboboxDemo01(){

        Container container = this.getContentPane();


        //下拉框
        JComboBox status = new JComboBox();

        status.addItem(null);
        status.addItem("正在上映");
        status.addItem("已下架");
        status.addItem("即将上映");

        container.add(status);

        this.setVisible(true);
        this.setBounds(100,100,500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new TestComboboxDemo01();
    }
}


