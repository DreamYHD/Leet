package LeetCode.sort;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/3/23.
 */
public class QuickSort {
    /**
     *
     * @param arr
     * @param left 左指针
     * @param right 右指针
     */
    public static void quickSort(int []arr,int left,int right){
        if (left < right) {
            dealPivot(arr,left,right);
            int pivot = right - 1;
            int i = left;
            int j = right - 1;
            while (true){
                //1 4 6 7 7 9 8 12
                while (arr[++i] < arr[pivot]){
                }
                while (j > left && arr[--j] > arr[pivot]){
                }
                if (i < j){
                    swap(arr,i,j);
                }else {
                    break;
                }

            }
            if (i < right){
                swap(arr,i,right - 1);
            }
            quickSort(arr,left, i - 1);
            quickSort(arr,i + 1,right);
        }
    }
    //处理枢纽值
    private static void dealPivot(int[] arr, int left, int right) {
        int mid = (left + right)/2;
        if (arr[left] > arr[mid]) {
            swap(arr,left,mid);
        }
        if (arr[left] > arr[right]){
            swap(arr,left,right);
        }
        if (arr[mid] > arr[right]){
            swap(arr,mid,right);
        }
        swap(arr,right - 1,mid);

    }
    //交换两个数字
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int a[] = new int[]{9,8,7,6,5,2,4,5,1,0};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }
}
