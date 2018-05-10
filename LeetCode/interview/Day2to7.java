package LeetCode.interview;

/**
 * Created by Administrator on 2018/5/10.
 */
//请实现一个函数，输入一个整数，输出这个数二进制中1的个数
    //每次右移以为，不断与1进行与运算，知道为0
public class Day2to7 {
    /**
     * 一个整数是32位，把该整数一直和1做与运算
     * @param n
     * @return
     */
    public static int numberberOfOne(int n){
        int result = 0;
        for (int i = 0; i < 32 ; i++) {
            result += (n & 1);
            n >>>= 01;
        }
        return result;
    }

    /**
     * 每次都清除最右边的1位 n&（n-1）直到所有的尾数都为0
     * @param n
     * @return
     */
    public static int numberOfOne2(int n){
        int result = 0;
        while ( n != 0){
            result ++;
            n = n & (n-1);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(numberOfOne2(8));

    }
}
