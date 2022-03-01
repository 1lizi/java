package struct;
/*While 和do-While的区别:
while 先判断后执行，dowhile是先执行后判断!
Do-while总是保证循环体会被至少执行一次
 */
public class DoWhileDemo01 {
    public static void main(String[] args){
        int i = 0;
        int sum = 0;
        do{
            sum = sum + i;
            i++;
        }while (i<=100);
        System.out.println(sum);
    }
}
