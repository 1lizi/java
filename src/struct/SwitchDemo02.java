package struct;

public class SwitchDemo02 {
    public static void main(String[] args){
        String name ="小白兔";
        //JDK7的新特性，表达式结构可以是字符串！！！
        //字符的本质还是数字
        //反编译 java---class(字节码文件)-----反编译（IDEA）
        switch (name){
            case "大白兔":
                System.out.println("大白兔");
                break;
            case "小狗":
                System.out.println("小狗");
                break;
            default:
                System.out.println("名字不存在");

        }

    }

}
