package LeetCode;

import java.util.Scanner;

/**
 * Created by Administrator on 2019/3/30.
 */
public class Main3 {
    public static int movingCount(int threshold,int rows,int cols){
        if (threshold<0||rows<0||cols<0){
            return 0;
        }
        boolean[]visited = new boolean[rows*cols];
        for (int i = 0; i <visited.length ; i++) {
            visited[i] = false;
        }
        return movingCountCore(threshold,rows,cols,0,0,visited);

    }
    private static int movingCountCore(int threshold,
                                       int rows,
                                       int cols,
                                       int row,
                                       int col,
                                       boolean []visited){
        int count = 0;
        if (check(threshold,rows,cols,row,col,visited)){
            visited[row*cols+col] = true;
            count = 1 + movingCountCore(threshold,
                    rows,
                    cols,
                    row - 1, col, visited)
                    + movingCountCore(threshold,
                            rows,
                            cols,
                            row,
                            col -1,
                            visited)
                    + movingCountCore(threshold,
                            rows,
                            cols,
                            row,
                            col+1,
                            visited)
                            + movingCountCore(threshold,
                            rows,
                            cols,
                            row+1,
                            col,
                            visited);

        }
        return count;
    }

    private static boolean check(int threshold, int rows, int cols, int row, int col, boolean[] visited) {
       return col >= 0&& col< cols && row >=0 && row<rows
               &&!visited[row*cols+col]
               &&(getDigitSum(col)+getDigitSum(row)
               <= threshold);
    }
    private static int getDigitSum(int number){
        int result = 0;
        while (number > 0){
            result += (number%10);
            result /= 10;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] a = scanner.nextLine().split(" ");
        System.out.println(movingCount(new Integer(a[0]),new Integer(a[1]),new Integer(a[2])));
    }
}
