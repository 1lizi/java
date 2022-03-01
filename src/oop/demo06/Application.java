package oop.demo06;
import oop.demo06.Person;
import oop.demo06.Student;
public class Application {
    public static void main(String[] args) {
        //类型之间的转换
        //子类转换为父类，可能丢失自己本来的一些方法
        Student student = new Student();
        student.go();
        Person person = student;//student(低) ->person(高) 可以自动转换

        Person obj = new Student();
        //student将这个对象转换为Student类型，就可以使用Student类型的方法
        ((Student)obj).go();
    }







/*
    public static void main(String[] args) {
        //Object > String
        //Object > Person > Teacher
        //Object > Person > Student
        Object object = new Student();

        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Teacher);//False  跟Student 无关是另外的一个分支
        System.out.println(object instanceof String);//False  String 类型是Object下的

        System.out.println("==============================");

        Person person = new Student();

        System.out.println(person instanceof Student);//true
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
        System.out.println(person instanceof Teacher);//False
       // System.out.println(person instanceof String);//编译报错

        System.out.println("==============================");

        Student student = new  Student();

        System.out.println(student instanceof Student);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Object);//true
        //System.out.println(student instanceof Teacher);//False编译报错
       // System.out.println(student instanceof String);//False编译报错
*/





































    }
/*
        //一个对象的实际类型是确定的
        //new Student();
        //new Person();

        //可以指向的引用类型不确定:父类的引用指向子类

        //Student 能调用的方法都是自己的或者继承父类的
        Student s1 = new Student();
        //Person父类型，可以指向子类，但是不能调用子类独有的方法
        Person s2 = new Student();
        Object s3 = new Student();
//对象能执行哪些方法，主要看对象左边的类型，和右边关系不大
        s2.run();//子类重写了父类的方法，执行子类的方法
        ((Student) s2).eat();//可以使用强制类型转换。将大类型转换为小类型
        s1.eat();
    }
 */

