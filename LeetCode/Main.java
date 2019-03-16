package LeetCode;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2019/3/16.
 */
public class Main {
    //输入行数  输入字符串
    //2
    //helloo
     //wooooooow
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String>result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = scanner.next();
            char[] charArray = s.toCharArray();
            char[] charArrayCopy = charArray;
            char[] charArrayCopy2 = charArray;
            int length = charArray.length;
            for (int j = 0; j < charArray.length - 3 ; j++) {
                int k = j;
                int index = 1;
                while (k < charArray.length - 3 && charArrayCopy[k] == charArrayCopy[k + 1] ){
                    index ++;
                    if (index == 2){
                        if (charArrayCopy[k+1]!=charArrayCopy[k+2] &&
                                charArrayCopy[k+2] == charArrayCopy[k+3]){
                            char[]chars = new char[charArrayCopy.length-1];
                            int num = 0;
                            for (int l = 0; l < charArrayCopy.length; l++) {
                                if (l == k+3){
                                    continue;
                               }else{
                                    chars[num++] = charArrayCopy[l];
                                }
                            }
                            result.add(String.valueOf(chars));
                        }
                    }
                    if (index == 3) {
                       int m = k+1;
                       while (charArrayCopy[m] == charArrayCopy[m++] ){
                           for (int l = m; l < charArrayCopy2.length - 1   ; l++) {

                           }
                       }
                    }
                    k++;

                }
            }

        }
        for (String s : result){
            System.out.println(s);
        }
    }
}
