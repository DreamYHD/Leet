package LeetCode.interview;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/5/10.
 */
//输入一个整数，把奇数放到前面，偶数放到后面
    //维护两个指针，一个指向开始，一个指向结束，第一个遇到偶数暂停，第一个遇到奇数暂停，交换
public class Day2to10 {
    public static void reorderOldEven(int arr []){
        if (arr == null || arr.length < 2  ){
            return;
        }
        int start =0;
        int end = arr.length - 1;
        while (start < end){
            //找到偶数
            while (start < end && arr[start] % 2 != 0){
                start ++;
            }
            while (start <end && arr[end] % 2 == 0){
                end --;
            }
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
        }



    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        reorderOldEven(arr);
        System.out.println(Arrays.toString(arr));


    }
}
