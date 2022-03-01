package com.li.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Time;
import java.util.Random;

//游戏的面板
//监听器可以放在内部类中
public class GamePanel extends JPanel implements KeyListener , ActionListener {

    //定义蛇的数据结构
    int length;//蛇的长度
    int[] snakeX = new int[600];//蛇的X坐标 25*25
    int[] snakeY = new int[500];//蛇的Y坐标 25*25
    //小蛇的脑袋不是一直一个方向
    String fx ;

    //食物的坐标
    int foodx;
    int foody;
    Random random = new Random();

    int score;//成绩
    //游戏当前的状态：开始，停止
    boolean isStart = false;//默认是不开始

    boolean isFail = false;//游戏失败状态

    //定时器 以ms为单位 1000ms =1s
      Timer timer = new Timer (300,this);//100毫秒执行一次

    //构造器
    public GamePanel(){
        init();
        //获得焦点和键盘事件
        this.setFocusable (true); //获得焦点事件
        this.addKeyListener(this);//获得键盘监听事件
        timer.start();//游戏一开始定时器就启动
    }


    //初始化方法
    public void init(){
        length = 3;
        snakeX[0] = 100;snakeY[0] = 100;//脑袋的坐标
        snakeX[1] = 75;snakeY[1] = 100;//第一个身体的坐标
        snakeX[2] = 50;snakeY[2] = 100;//第二个身体的坐标
        fx = "R";//初始方向向右
        //把食物随机分布在界面上
        foodx = 25 + 25*random.nextInt(34);
        foody = 75 + 25*random.nextInt(24);

        score = 0;



    }


    //绘制面板，游戏中的所有东西，都是用这个画笔来画

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //清屏
        //绘制静态的面板
        this.setBackground(Color.WHITE);
        Data.header.paintIcon(this,g,25,11);//头部广告栏
        g.fillRect(25,75,850,600);//默认的游戏界面

        //画积分
        g.setColor(Color.white);
        g.setFont(new Font("微软雅黑",Font.BOLD,18));
        g.drawString("长度" +length,750,35);
        g.drawString("分数"+score,750,50);

        //画食物
        Data.food.paintIcon(this,g,foodx,foody);

        //把小蛇画上去
        if(fx.equals("R")){
             Data.right.paintIcon(this,g,snakeX[0],snakeY[0]);//蛇头初始化向右，需要通过方向来判断
        }else if(fx.equals("L")){
            Data.left.paintIcon(this,g,snakeX[0],snakeY[0]);//蛇头初始化向右，需要通过方向来判断
        } else if(fx.equals("U")){
            Data.up.paintIcon(this,g,snakeX[0],snakeY[0]);//蛇头初始化向右，需要通过方向来判断
        } else if(fx.equals("D")){
            Data.down.paintIcon(this,g,snakeX[0],snakeY[0]);//蛇头初始化向右，需要通过方向来判断
        }

        for(int i = 1; i < length ; i++) {
            Data.body.paintIcon(this,g,snakeX[i],snakeY[i]);//第一个身体的坐标
        }


        //游戏状态
        if (isStart==false){
            g.setColor(Color.white);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));//设置字体
            g.drawString("按下空格开始游戏",300,300);
        }

        if (isFail){
            g.setColor(Color.RED);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));//设置字体
            g.drawString("游戏失败，按下空格重新开始",200,300);
        }
    }


//键盘监听事件
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();//获得键盘按键是哪一个

        if(keyCode == KeyEvent.VK_SPACE){ //如果按下的是空格键
            if (isFail){
                //重新开始
                isFail = false;
                init();
            } else {

                isStart = !isStart;//取反
            }
            repaint();
        }
        //小蛇移动
        if (keyCode == KeyEvent.VK_UP){
            fx = "U";
        }else if (keyCode == KeyEvent.VK_DOWN){
            fx = "D";
        }else if (keyCode == KeyEvent.VK_LEFT){
            fx = "L";
        }else if (keyCode == KeyEvent.VK_RIGHT){
            fx = "R";
        }


    }
    //事件监听---需要通过固定事件来刷新，1s=10次
    @Override
    public void actionPerformed(ActionEvent e) {
       if (isStart && isFail == false) { //如果游戏是开始状态，就让小蛇动起来

           //吃食物
           if (snakeX[0] == foodx && snakeY[0] == foody){
               //长度加1
               length++;
               //分数加10
               score = score +10;
               //再次随机食物
               foodx = 25 + 25*random.nextInt(34);
               foody = 75 + 25*random.nextInt(24);
           }

           //移动
           for (int i = length - 1; i > 0; i--) {//后一节移到前一节的位置 snakeX[1] = snakeX[0];
               snakeX[i] = snakeX[i - 1];
               snakeY[i] = snakeY[i - 1];
           }
           //走向
           if (fx.equals("R")){
               snakeX[0] = snakeX[0] + 25;//让小蛇的头移动
               if (snakeX[0]>850) { snakeX[0] = 25; }//边界判断
           }else if (fx.equals("L")){
               snakeX[0] = snakeX[0] - 25;
               if (snakeX[0]<25) { snakeX[0] = 850; }//边界判断
           }else if (fx.equals("U")) {
               snakeY[0] = snakeY[0] - 25;
               if (snakeY[0] < 75) { snakeY[0] = 650; }//边界判断
           }else if (fx.equals("D")) {
               snakeY[0] = snakeY[0] + 25;
               if (snakeY[0] > 650) { snakeY[0] = 75; }//边界判断
           }

           //失败判定，撞到自己就算失败
           for (int i =1 ;i < length ; i++){
               if (snakeX[0]==snakeX[i] && snakeY[0]==snakeY[i]){
                   isFail = true;
               }
           }
           repaint();//重画页面
       }
       timer.start();//定时器开启
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }


}