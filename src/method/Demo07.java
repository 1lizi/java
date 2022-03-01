package method;

import java.util.Scanner;

public class Demo07 {
    // 计算器  写4个方法：加减乘除
    //        利用循环+switch进行用户交互
    //        传递需要操作的两个数
    //        输出结果
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int isContinue = 1;
        while (isContinue == 1) {
            System.out.println("===请输入第一个参数===");
            double parm1 = scanner.nextDouble();
            System.out.println("===请输入第二个参数===");
            double parm2 = scanner.nextDouble();
            System.out.println("===请选择计算方式===");
            System.out.println("===加法请输入：0===");
            System.out.println("===减法请输入：1===");
            System.out.println("===乘法请输入：2===");
            System.out.println("===除法请输入：3===");
            int type = scanner.nextInt();
            switch (type) {
                case 0:
                    System.out.println("结果为" + add(parm1, parm2));
                    break;
                case 1:
                    System.out.println("结果为" + subtraction(parm1, parm2));
                    break;
                case 2:
                    System.out.println("结果为" + multiplication(parm1, parm2));
                    break;
                case 3:
                    System.out.println(division(parm1, parm2));
                    break;
                default:
                    System.out.println("非法参数");
            }
            System.out.println("===继续计算？ 1：继续， 2：停止===");
            isContinue = scanner.nextInt();
        }
        scanner.close();
        System.out.println("运算结束");
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static String division(double a, double b) {
        double result = 0;
        if (a % b != 0) {
            double result2 = a % b;
            result = a / b;
            return "结果为" + result + "  余数为" + result2;
        } else {
            result = a / b;
        }
        return "结果为" + result;
    }
}
    