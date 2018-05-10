package LeetCode.interview;

/**
 * Created by Administrator on 2018/5/10.
 */
//输入数字n,按照顺序打印出1到n位最大的数字，比如输入2，打印出1,2,3到999；
//1，使用一个n位的数组来存储每一位元素，例如 n = 3；，择0,0,0,表示为【0,0,0】，使用递归的方式，存放每一个元素
//2,使用一个n位的数组来存储每一个元素，然后循环执行加1运算，并在数组中进行模拟进位，知道最高位需要进位，循环结束
public class Day2to8 {

    public static void printOneToNthDigits(int n){
        if (n < 1) {
            throw new RuntimeException("the input number musy lager tan 0");
        }
        int []arr = new int[n];
        printOneToNthDigits(0,arr);
    }

    private static void printOneToNthDigits(int n, int[] arr) {
        if (n >= arr.length){
            printArr(arr);
        }else {
            for (int i = 0; i <= 9 ; i++) {
                arr[n] = i;
                printOneToNthDigits(n+1,arr);
            }
        }

    }

    private static void printArr(int[] arr) {
        //找到第一个非0元素
        //从第一个非0值开始输出到最后一个元素
    }

    public static void main(String[] args) {




    }
}
