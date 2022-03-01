package array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};
        //JDK1.5,没有下标
       // for (int array : arrays) { //arrays.for
         //    System.out.println(array);
        //}
        //System.out.println("===============");
       // printArray(arrays);
        int[] reverse = reverse(arrays);//reverse(arrays);
        printArray(reverse);//打印数组元素
    }
    //反转数组
    public static int[] reverse(int[] arrays){
        int[] result = new int[arrays.length];

        //反转的操作
        for (int i = 0,j=result.length-1; i < arrays.length;i++,j--){
            result[j] = arrays[i];
        }
        return result;
    }
    //打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0;i < arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }
    }


}
