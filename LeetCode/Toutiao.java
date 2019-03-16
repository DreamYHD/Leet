package LeetCode;

import java.util.Scanner;

/**
 * Created by Administrator on 2019/3/16.
 */
public class Toutiao {
    //1024 ( 0 < N < 1024)1 4 16 64
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (  N > 0 && N <= 1024) {
            int next = 1024 - N;
            int num64 = next / 64;
            int cost64 = next % 64;
            int num16 =  cost64/ 16;
            int cost16 = cost64 % 16;
            int num4 = cost16 / 4;
            int cost4 = cost16 % 4;
            int num1 = cost4;
            System.out.println(num1 + num4 + num16 + num64);
        }else {
            System.out.println("输入不合格");
        }

    }
}
