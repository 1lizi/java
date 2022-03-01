package com.li.lesson03;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//键
public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame();
    }
}

class KeyFrame extends Frame{
    public KeyFrame() {
        setBounds(1,2,300,400);
        setVisible(true);

        this.addKeyListener(new KeyAdapter() {
            @Override
            //键盘按下
            public void keyPressed(KeyEvent e) {
                //获得键盘按下的键是哪一个,当前的码
                int keyCode = e.getKeyCode();//不需要去记这个数值，直接使用静态属性 VK_XXX
                System.out.println(keyCode);
                if (keyCode == KeyEvent.VK_UP){
                    System.out.println("你按下了上键");

                }
                //根据按下不同操作，产生不同结果：
            }
        });
    }
}
