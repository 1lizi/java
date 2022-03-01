package exception.demo01;

public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        //Ctrl + Alt +T
        try {
            b = 0;
        } catch (Exception e) {
            e.printStackTrace();//打印错误的栈信息
        } finally {
        }

        System.out.println(a/b);
    }
}
