package oop.demo02;
//一个项目应该只有一个main方法
public class Application {
    public static void main(String[] args){
        //类： 抽象的，实例化
        //类实例化后会返回一个自己的对象！
        //student对象就是一个Student类的具体实例！
        Student jerry = new Student();
        Student tom = new Student();

        jerry.name = "杰瑞";
        jerry.age =3;

        System.out.println(jerry.name);
        System.out.println(jerry.age);

        tom.name = "汤姆";
        tom.age = 3;

        System.out.println(tom.name);
        System.out.println(tom.age);



        //new实例化了一个对象
        Person person = new Person("xiaolizi");
        System.out.println(person.name);//null
    }
}
