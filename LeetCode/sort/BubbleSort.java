package LeetCode.sort;

/**
 * Created by Administrator on 2018/3/23.
 */
public class BubbleSort {
    private static void bubbleSort(int arr[]){
        for (int i = 0; i <arr.length -1 ; i++) {
            for (int j = 0; j <arr.length -1 - i ; j++) {
                if (arr[j] < arr[j + 1]){
                       arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                        arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {1,10,54,12,23,33,45,74,44,45};
        bubbleSort(arr);
        for (int  s : arr) {
            System.out.println(s);
        }
    }
}
