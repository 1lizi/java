package array;

public class ArrayDemo01 {
    //变量的类型 变量的名字 =变量的值；
    //数组类型
    public static void main (String[] args) {
        int[] nums; //1.定义
        nums = new int[10];//2.创建一个数组  这里面可以存放10个int类型的数字
        //int[] nums2 = new int[10]
        //3.给数组元素中赋值
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        System.out.println(nums[7]);
        //计算所有元素的和
        int sum = 0;
         for (int i = 0; i < nums.length ; i++){
             sum = sum + nums[i];
         }
         System.out.println("总和为： "+sum);
    }
}
