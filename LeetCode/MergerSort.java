package LeetCode;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/3/23.
 */
//每次合并操作的平均时间复杂度为O(n)，而完全二叉树的深度为|log2n|。总的平均时间复杂度为O(nlogn)。而且，归并排序的最好，最坏，平均时间复杂度均为O(nlogn)。
public class MergerSort {
    public static void sort(int num[]){
        int []temp = new int[num.length];
        sort(num,0,num.length - 1,temp);

    }
    public static void sort(int[] nums, int left, int right, int[] temp){
        if (left < right) {
            int mid = (left + right)/2;
            sort(nums,left,mid,temp);
            sort(nums,mid+1,right,temp);
            merge(nums,left,mid,right,temp);
        }
    }
    private static void merge(int[] nums, int left, int mid, int right, int[] temp) {
        int i = left;//左边索引
        int j = mid + 1;//右边索引
        int t = left;//temp的下标index
        while (i <= mid && j <= right ){
            if ( nums[i] <= nums[j]) {
                temp[t++] = nums[i++];
            }else {
                temp[t++] = nums[j++];
            }
        }
        while (i <= mid){
            temp[t++] = nums[i++];
        }
        while (j <= right){
            temp[t++] = nums[j++];
        }
        int index = left;
        while (left <= right){
            nums[left++] = temp[index++];
        }
    }
    public static void main(String[] args) {
        int []num = new int[]{4,5,2,15,0,23,7,6,9,11};
        sort(num);
        System.out.println(Arrays.toString(num));
    }


}
