package method;

public class Demo01 {
    //main方法  public static 是修饰符
    public static void main(String[] args){
        //实际参数
        int sum = add(1,  2);
        System.out.println(sum);
    }



    //加法
    //形式参数，用来定义作用的
    public static int add(int a,int b){
        return a+b;

    }
}
