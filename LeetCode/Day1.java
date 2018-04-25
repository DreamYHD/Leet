package LeetCode;

/**
 * Created by Administrator on 2017/10/31.
 */
public class Day1 {
    //二分查找法(Binary Search) 对于有序数列，才能使用二分查找
    public int binarySearch(int  arry[], int n, int  target) {

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

    public static void main(String[] args) {

    }
}
