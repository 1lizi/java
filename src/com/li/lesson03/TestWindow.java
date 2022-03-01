package com.li.lesson03;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame{
    public WindowFrame() {
        setBackground(Color.blue);
        setBounds(100,100,200,200);
        setVisible(true);
        //addWindowListener(new MyWindowListener());

        this.addWindowListener(//this， 就是本身，然后本身加入这个方法，就是匿名内部类
                //匿名内部类，建议这么写
                new WindowAdapter() {
                    @Override
                    public void windowOpened(WindowEvent e) {
                        //super.windowOpened(e);
                        System.out.println("windowOpened");
                    }

                    @Override
                    //关闭窗口
                    public void windowClosing(WindowEvent e) {
                        //super.windowClosing(e);
                        System.out.println("windowClosing");
                        System.exit(0);
                    }

                    @Override
                    public void windowClosed(WindowEvent e) {
                        //super.windowClosed(e);
                        System.out.println("windowClosed");
                    }



                    @Override
                    //激活窗口
                    public void windowActivated(WindowEvent e) {
                        //super.windowActivated(e);
                        WindowFrame source = (WindowFrame) e.getSource();
                        source.setTitle("被激活了");
                        System.out.println("windowActivated");//激活
                    }


                }
        );
    }
/* 内部类
    class MyWindowListener extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            //super.windowClosing(e);
            //setVisible(false); //隐藏窗口，通过按钮，隐藏当前窗口
            System.exit(0);//正常退出
        }
    }

 */

}
