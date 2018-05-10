package LeetCode.interview;

/**
 * Created by Administrator on 2018/5/10.
 */
public class Day2to6 {
    public static long finbonacci(int n){
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        long prePre = 1;
        long pre =1;
        long current =0;
        for (int i = 3; i <= n ; i++) {
            current = prePre + pre;
            prePre = pre;
            pre = current;
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println(finbonacci(3));

    }
}
