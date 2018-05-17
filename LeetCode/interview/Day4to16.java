package LeetCode.interview;

/**
 * Created by Administrator on 2018/5/13.
 */

/**
 * 打印螺旋矩阵
 */
public class Day4to16 {
    public static void all(int[][] arr){
        int height = arr.length - 1;
        int length = arr[0].length - 1;
        int indexH = 0;
        int indexL = 0;

        int changeT = 0;
        int changeB = height;
        int changeS = 0;
        int changeE = length;


        while (changeT <= changeB){
            while (indexL <= changeE){
                System.out.print(arr[indexH][indexL]+" ");
                indexL++;
            }
            changeT ++;
            System.out.println();
            indexL --;
            indexH ++;
            while (indexH <= changeB){
                System.out.print(arr[indexH][indexL]+" ");
                indexH ++;
            }
            changeE --;
            System.out.println();
            indexH --;
            indexL --;
            while (indexL >= changeS){
                System.out.print(arr[indexH][indexL]+" ");
                indexL --;
            }
            changeB --;
            System.out.println();
            indexL ++;
            indexH --;
            while (indexH >= changeT ){
                System.out.print(arr[indexH][indexL]+" ");
                indexH --;
            }
            changeT ++;
            System.out.println();
            indexH ++;
        }




    }
    public static void main(String[] args) {
        int [][]arr = new int[][]{
                {1,2,3,4,5},
                {10,9,8,7,6},
                {11,12,13,14,15},
                {20,19,18,17,16},
                {21,22,23,24,25},};
        all(arr);



    }

}
