package exception.demo01;

public class Test {
    public static void main(String[] args){
        //使用try catch可以捕获异常 不会使程序终止，会使程序运行下去
        try {
            new Test().test(1,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    //假设这个方法中，处理不了这个异常。方法上抛出异常
    public void test(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException();//主动抛出异常,一般在方法中使用
        }
    }



}










/*  int a = 1;
        int b = 0;

        try{ //try监控区域
            System.out.println(a/b);
        }catch (ArithmeticException e){//catch（其中Throwable最高） 捕获异常
            System.out.println("程序出现异常，变量b不能为0");
        }finally {//处理善后工作
            System.out.println("finally");
        }

        //finally 可以不要finally

        */