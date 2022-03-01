package com.li.lesson04;

import javax.swing.*;
import java.awt.*;

//图标，需要实现类，Frame 继承
public class IconDemo extends JFrame implements Icon {
    private  int width;
    private int height;

    public IconDemo(){}//无参构造

    public IconDemo(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void init(){
        this.setBounds(100,100,700,500);
        IconDemo iconDemo = new IconDemo(15, 15);
        //图标放在标签上，也可以放在按钮上！
        JLabel label = new JLabel("icontest", iconDemo, SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new IconDemo().init();

    }

    public void paintIcon(Component c, Graphics g, int x, int y){
        g.fillOval(x,y,width,height);
    }

    public int getIconWidth(){
        return this.width;
    }

    public int getIconHeight(){
        return this.height;
    }
}
