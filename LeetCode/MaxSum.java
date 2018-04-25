package LeetCode;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/4/8.
 */
public class MaxSum {
    static int n ;
    static int MAX = 100;
    static int D[][] = new int[MAX][MAX];
    private static int MaxSumCode(int i, int j){
        if ( i == n){
            return D[i][j];
        }
        int x = MaxSumCode(i+1,j);
        int y = MaxSumCode(i+1,j+1);
        return Math.max(x,y)+D[i][j];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                D[i][j] = s.nextInt();
            }
        }
        System.out.println(MaxSumCode(1,1));

    }
}
