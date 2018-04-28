package LeetCode.sort;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/3/23.
 */
public class HeapSort {
    public static void sort(int []arr){
        //1构建最大堆
        for (int i = arr.length / 2 - 1; i >= 0 ; i--) {
            //从第一个非叶子结点从下到上从右到左调整结构
            adjustHeap(arr,i,arr.length);
        }
        //2调整堆结构 + 交换堆顶元素和末尾元素
        for (int i = arr.length -1; i > 0 ; i--) {
            swap(arr,0,i);//将堆顶元素与末尾元素进行交换
            adjustHeap(arr,0,i);//从新对堆进行调整
        }
    }

    /**
     * 调整大顶堆，仅仅是调整过程，建立在大顶堆构建的基础上
     * @param arr
     * @param i
     * @param length
     */
    private static void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];
        for (int j = i * 2 + 1; j < length; j = j * 2 + 1) {
            if ( j + 1 < length && arr [j] < arr [j+1]){
                j ++;
            }
            if (arr[j] > temp){
                arr[i] = arr[j];
                i = j;
            } else {
                break;
            }
        }
        arr[i] = temp;


    }
    public static void main(String[] args) {
        int[] arr = new int[]{9,8,7,6,5,4,3,2,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //交换两个数字
    public static void swap(int []arr,int a,int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
}
