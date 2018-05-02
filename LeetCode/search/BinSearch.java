package LeetCode.search;

/**
 * Created by Administrator on 2017/10/31.
 */
public class BinSearch {
    //二分查找法(Binary Search) 对于有序数列，才能使用二分查找
    public static int binarySearch(int  arry[], int n, int  target) {

        int l = 0, r = n - 1;//在【l...r】范围内查找target
        while ( l <= r){
            int mid = l + ( r - l ) / 2;//防止整形溢出
            if (( arry[mid] == target)){
                return mid;
            }
            if (arry[mid] < target){
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return -1;
    }
    public static int binarySearch(int arr[] ,int l ,int r,int target){
        int mid = l + ( r - l ) / 2;
        if (arr[mid]== target) {
            return  mid;
        }
        if (l >= r) {
            return  -1;
        }else if(target > arr[mid]){
            return binarySearch(arr,mid+1,r,target);
        }else {
            return binarySearch(arr, l, mid - 1, target);
        }
    }
    public static int binarySearch2(int arr[],int l,int r,int target){
        int mid = (l + r)/2;
        if (arr[mid] == target){
            return  mid;
        }
        if ( l > r){
            return -1;
        }else if (target > arr[mid]){
            return binarySearch2(arr, mid + 1, r, target);
        }else {
            return binarySearch(arr,l,mid -1 ,target);
        }
    }
    public static void main(String[] args) {
        int srcArray[] = {3,5,11,17,21,23,28,30,32,50,64,78,81,95,101};
        System.out.println(binarySearch(srcArray, 0, srcArray.length - 1, 222));
        System.out.println(binarySearch(srcArray,srcArray.length,81));
    }
}
