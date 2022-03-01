package oop.demo05;
import oop.demo05.A;
//import oop.demo05.Student;
//import opp.demo05.Person;
public class Application {
    public static void main(String[] args){
        //方法的调用只和左边，定义的数据类型有关
        A a = new A();
        a.test();//A类的方法
//父类的引用指向了子类  B类为父类
        B b = new A();
        b.test();//B类的方法























        // Student student = new Student();
       // student.test("栗子");
      //  student.test1();
    }





        /*
        //public
        //protected
        //default
        //private
        Student student = new Student();
        student.say();
        System.out.println(student.getMoney());
    }
         */
}
