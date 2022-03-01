package operator;

public class Demo04 {
    public static void main(String[] args) {
        //++ -- 自增 自减 一元运算符
        int a = 3;
        //b=a=3, a=a+1=4
        int b = a++;
        //c=a+1=5 a=5;
        int c = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
// 幂运算 2^3  使用工具类来完成
        double pow = Math.pow(2, 3);
        System.out.println(pow);
      //短路运算
      int d = 5;
      boolean  e =(d<4)&&(d++<4);
      System.out.println(e);
      System.out.println(d);

    }
}


