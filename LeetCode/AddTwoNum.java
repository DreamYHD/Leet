package LeetCode;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/4/9.
 */
public class AddTwoNum {
    public static int[] twoSum(int[] nums, int target) {
        int [] a = new int[2];
        for (int i = 0; i <nums.length - 1 ; i++) {
            for (int j = i + 1; j <nums.length ; j++) {
                if (nums[i] + nums[j] == target){
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int a[] = new int[]{2,7,11,5};
        int b[] = twoSum(a,9);
        for (int aB : b) {
            System.out.println(a[aB]);

        }
    }
}
