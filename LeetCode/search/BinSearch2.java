package LeetCode.search;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/5/2.
 */
public class BinSearch2 {

    public static void main(String[] args) {
        int srcArray[] = {3,5,11,17,21,23,28,30,32,50,64,78,81,95,101};
        Arrays.sort(srcArray);
        System.out.println(binarySearch(srcArray, 0, srcArray.length - 1, 22));
        System.out.println(binarySearch(srcArray,srcArray.length,81));
    }

    private static int binarySearch(int[] srcArray, int i, int i1, int i2) {


        return -1;
    }
    private static int binarySearch(int[] srcArray, int length, int i2) {
        return -1;
    }
}
