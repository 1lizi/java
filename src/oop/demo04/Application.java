package oop.demo04;

public class Application {
    public static void main(String[] args){
        Student s1 = new Student();

        s1.setName("小栗子");
         System.out.println(s1.getName());

         s1.setAge(999);
         System.out.println(s1.getAge());
    }
}
