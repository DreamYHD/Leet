package LeetCode.interview;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/5/9.
 */
public class Day1to3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(",");
        int length  = a.length;
        String [][]num = new String[length][length];
        num[0] = a;
        for (int i = 1; i < length ; i++) {
            num[i] = scanner.nextLine().split(",");
        }
        int index = 0;
        int i = index;//i作为控制行数
        int j = length - 1;//j控制列数
        if (length == 1) {
            System.out.println(num[0][0]);
        }else {
            while (i - 1 != j){
                while (i < length - 1 ){
                    System.out.print(num[i][j]+",");
                    i++;
                }
                while (j > index){
                    System.out.print(num[i][j]+",");
                    j--;
                }
                while (i > index){
                    System.out.print(num[i][j]+",");
                    i--;
                }
                while (j < length - 1){
                    System.out.print(num[i][j]+",");
                    j ++;
                }
                index++;
                length--;
                i++;
                j--;
            }
        }
    }
}
