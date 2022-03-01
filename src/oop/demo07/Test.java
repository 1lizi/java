package oop.demo07;

//abstract 抽象类：类 extends: 单继承（接口可以多继承）
abstract class Action{
    //约束 可以自行实现
    //abstract,抽象方法，只有方法名字，没有方法的实现！
    public abstract void doSomething();

    //1. 不能new 这个抽象类，只能靠子类去实现它；约束
    //2.抽象类中可以写普通的方法1
    //3.抽象方法必须在抽象类中
}






















/*
//静态导入包
import static java.lang.Math.random;
import static java.lang.Math.PI;

public class Test {

    public static void main(String[] args) {
        System.out.println(random());
        System.out.println(PI);
    }
}
*
 */
