package LeetCode.search;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/5/2.
 */
public class BinSearch2 {

    public static void main(String[] args) {
        int srcArray[] = {3,5,11,17,21,23,28,30,32,50,64,78,81,95,101};
        Arrays.sort(srcArray);
        System.out.println(binarySearch(srcArray, 0, srcArray.length - 1, 81));
        System.out.println(binarySearch(srcArray,srcArray.length,81));
    }

    private static int binarySearch(int[] srcArray, int i, int i1, int i2) {

        int mid = i + ( i1 - i)/2;
        if (srcArray[mid] == i2){
            return mid;
        }
        if ( i  >  i1) {
            return -1;
        }else if (srcArray[mid] > i2){
            return binarySearch(srcArray, i, mid - 1, i2);
        }else {
            return binarySearch(srcArray,mid+1,i1,i2);
        }
    }
    private static int binarySearch(int[] srcArray, int length, int i2) {
        int l = 0 ,r = length - 1;
        while ( l <= r){
            int mid = l + ( r - l )/2;
            if (srcArray[mid] == i2){
                return mid;
            }
            if (srcArray[mid] > i2){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
