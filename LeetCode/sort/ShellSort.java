package LeetCode.sort;

/**
 * Created by Administrator on 2018/3/23.
 */
public class ShellSort {
    public static void sort(int arr []){
        for (int gap = arr.length / 2 ; gap > 0; gap --) {
            for (int i = gap; i <arr.length ; i++) {
                int j = i;
                while (j - gap >= 0 && arr[i] <arr[i - gap]){
                    swap(arr,j,j-gap);
                    j -= gap;
                }
            }
        }
    }
    public static void swap(int []arr,int a,int b){
              arr[a] = arr[a]+arr[b];
              arr[b] = arr[a]-arr[b];
              arr[a] = arr[a]-arr[b];
    }
    public static void main(String[] args) {
        int []arr = {1,10,54,12,23,33,45,74,44,45};
        sort(arr);
        for (int  s : arr) {
            System.out.println(s);
        }
    }
}
