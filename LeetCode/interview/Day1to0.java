package LeetCode.interview;

/**
 * Created by Administrator on 2018/5/9.
 */

/**
 * 请实现一个函数，把字符串中的每个空格替换成%20，例如We are happy输出“We%20are%20happy
 *
 * 先判断是否有足够的空间，计算出需要的空间，根据最终需要的总空间，维护一个指针在最后，遇到非空就把指针移动到当前位置，然后指针向前移动，遇到空格，择指针前移，以此替换为02%
 */
public class Day1to0 {
    public static int replaceBlank(String string){
        // 判断输入是否合法
        if (string == null){
            return -1;
        }
        int usedLength = string.length();

        int whiteCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' '){
                whiteCount ++ ;
            }
        }
        //计算转化后的总使用长度
        int targetCount =  whiteCount * 2 + usedLength;
        int temp = targetCount; //用于返回值
        char []chars = new char[targetCount];
        // 如果没有空白字符就不用处理
        if (whiteCount == 0) {
            return usedLength;
        }
        usedLength --;//从后往前处理
        targetCount --;//处理后的字符放置的位置
        while ( usedLength >= 0 && usedLength <= targetCount){
            if (string.charAt(usedLength) == ' '){
                chars[targetCount--] = '0';
                chars[targetCount--] = '2';
                chars[targetCount--] = '%';
            }else {
                chars[targetCount--] = string.charAt(usedLength);
            }
            usedLength --;
        }

        System.out.println(new String(chars));
        return temp;
    }
    public static void main(String[] args) {
        String s = "we are happy";
        if (replaceBlank(s) == -1){
            System.out.println("error");
        }else {
            System.out.println(replaceBlank(s));
        }

    }
}
