package LeetCode;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/4/8.
 */
//动态规划
public class MaxMoney {
    static int max = 100;
    static int n;//行数
    static int D[][] = new int[max][max];//每个位置的值
    static int maxSum[][] = new int[max][max];//从该位置开始的最大值

    private static int select(int i , int j){
        if ( maxSum[i][j] != -1 ) {
            return maxSum[i][j];
        }
        if ( i == n ){
            maxSum[i][j] = D[i][j];
        }else {
            int x = select(i+1,j);
            int y = select(i+1,j+1);
            maxSum[i][j] = Math.max(x,y)+D[i][j];
        }
        return maxSum[i][j] ;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i  ; j++) {
                D[i][j] = s.nextInt();
                maxSum[i][j] = -1;
            }
        }
        System.out.println(select(1,1));
    }
}
