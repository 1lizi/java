package oop.demo07;

public class Person {
    {
        System.out.println("匿名代码块");
    }
    static {
        System.out.println("静态代码块");
    }
        public Person(){
            System.out.println("构造方法");
        }
        public static void main (String[] args){
            Person person1= new Person();
            System.out.println("============");
           Person person2 = new Person();
}
}