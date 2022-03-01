package struct;

public class ForDemo04 {
    //打印99乘法表
    /*
    1.  按照九九乘法表的行来观察  j*i 满足 其中 j逐渐增大 i始终小于等于j
    2.每输出一个式子就应该满足一个空格
    3.每输完一行  即i>j则换行
    */
    public static void main(String[] args) {

        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }
    }
}