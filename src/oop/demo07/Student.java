package oop.demo07;
//static
public class Student {

    private static int age;//静态变量
    private double score;//非静态的变量

    public  void run(){

    }

    public static void go(){

    }
    public static void main(String[] args){
       go();
      // run();//报错











        /*
        Student s1 = new Student();

        System.out.println(Student.age);
        System.out.println(s1.age);
        System.out.println(s1.score);
         */
    }

}
