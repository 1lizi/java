package array;

import java.util.Arrays;

public class ArrayDemo05 {
    public static void main(String[] args){
        int[] a ={1,2,3,4,555,788,7,86};
        System.out.println(a);//对象的哈希code

        //打印数组元素Arrays.toString
        System.out.println(Arrays.toString(a));

        printArray(a);

        Arrays.sort(a);//数组进行排序 : 升序
        System.out.println(Arrays.toString(a));

        Arrays.fill(a,0);//数组填充
        System.out.println(Arrays.toString(a));
    }

    public static void printArray(int[] a){
        for (int i = 0; i < a.length ; i++){
            if (i==0){
                System.out.print("[");
            }
            if (i==a.length-1){
                System.out.println(a[i]+"] ");
            }else {
                System.out.print(a[i]+", ");
            }
        }
    }
}
