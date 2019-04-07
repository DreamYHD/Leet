package LeetCode.sort;

/**
 * Created by Administrator on 2018/3/23.
 */
public class InsertSort {
    private static void insertSort1(int arr[]){
        for (int i = 1; i <arr.length ; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j-1] > temp ){
                arr[j] = arr[j - 1];
                j -- ;
             }
            arr[j] = temp;
        }
    }
    private static void insertSort(int arr[]){
        int length  = arr.length;
        for (int i = 1; i < length ; i ++){
            int j = i ;
            int temp = arr[i];
            while (j > 0 && arr[j - 1] > temp){
                arr[j] = arr[j - 1];
                j --;
            }
            arr[j] = temp;
        }
    }
    private static void insertSort3(int arr[]){
        for (int i = 1; i <arr.length ; i++) {
            int temp = arr[i];
            int j = i;
            while (j>0 && arr[j - 1]>temp){
                arr[j] = arr[j-1];
                j--;
            }

            arr[j] = temp;
        }
    }



    public static void main(String[] args) {
        int []arr = {1,10,54,12,23,33,45,74,44,45};
        insertSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }


    }
}
