package oop.demo05;
//Student is 人 :派生类,子类
//子类继承了父类，就会拥有父类的全部方法！
public class Student extends Person {
    public Student() {
        //隐藏代码：调用了父类的无参构造
        System.out.println("Student 无参执行");
    }
    //Ctrl+H


    private String name = "lizi";
    public void print(){
        System.out.println("Student");
    }
    public void test1(){
        print();
        this.print();
        super.print();

    }



    public void test(String name) {
        System.out.println(name);//传递的参数
        System.out.println(this.name);//类里面的
        System.out.println(super.name);//父类
    }
}