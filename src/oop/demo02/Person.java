package oop.demo02;

public class Person {
    //一个类即使什么都不写，他也会存在一个方法
    //显示的定义构造器

    String name;
    int age;

    //1.使用new关键字，本质是在调用构造器
    //2.用来初始化值
    public Person(){

    }


    //有参构造  一旦定义了有参构造，无参就必须显示定义
    public Person(String name){
        this.name = name;
    }
}
