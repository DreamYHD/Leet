package LeetCode.interview;

/**
 * Created by Administrator on 2018/5/9.
 */

/**
 * 把一个数组的最开始若干个元素搬到数组的尾部，我们称为数组的旋转，输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如数组{3，4,5,1,2}为数组{1,2,3.4.5}的一个旋转，概述增速的的最小值为1
 * step1：和二分查找一样，我们用两个指针分别指向第一个元素和最后一个元素
 * step2: 找到数组的中间元素、
 * step3: 用跟新后的指针做新一轮的查找
 */
public class Day1to5 {
    public static int min(int numbers[]){
        if (numbers == null || numbers.length == 0) {
            throw new RuntimeException("invalid");
        }
        int lo = 0;
        int hi = numbers.length - 1;
        int mi = lo;
        while (numbers[lo] >= numbers[hi]){
            if ((hi - lo) == 1){
                return numbers[hi];
            }
            //取中间数
            mi = (lo + hi) / 2;
            if (numbers[lo] == numbers[hi] && numbers[lo] == numbers[mi] ) {
                return minInorder(numbers,hi,lo);
            }
            if (numbers[mi] >= numbers[lo]){
                lo = mi;
            }else if (numbers[mi] <= numbers[hi]){
                hi = mi;
            }

        }
        return numbers[mi];
    }


    public static int minInorder(int[]numbers,int start,int end){
        int result = numbers[start];
        for (int i = start + 1; i <= end; i++) {
            if (result > numbers[i]){
                result = numbers[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {




    }
}
