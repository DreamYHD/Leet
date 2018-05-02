package LeetCode.sort;

/**
 * Created by Administrator on 2018/3/23.
 */
public class SelectSort {
    private static void selectSort(int arr[]){

        for (int i = 0;i < arr.length ; i ++ ){
            for (int j = i + 1; j <arr.length ; j++) {
                if( arr[i] < arr [j]){
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {1,10,54,12,23,33,45,74,44,45};
        selectSort(arr);
        for (int  s : arr) {
            System.out.println(s);
        }
    }
}
