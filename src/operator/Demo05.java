package operator;
//import com.kuang.base.* 表示将base包下的类全部导入
public class Demo05 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a+=b;//a=a+b
        a-=b;//a=a-b
        System.out.println(a);
        //字符串连接符 + , String  字符串在前是拼接 字符串在后  前面依然进行运算
        System.out.println(""+a+b);
        System.out.println(a+b+"");
    }
}
