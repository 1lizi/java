package oop.demo05;
//在JAVA中，所有的类，都默认直接或者间接继承object
//Person  父类
public class Person {
    public Person() {
        System.out.println("Person无参执行");
    }

    protected String name = "xializi";
    public void print(){
        System.out.println("Person");
    }





    /*
    private int money= 10_0000_0000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void say(){
        System.out.println("学会说话");

    }*/
}
