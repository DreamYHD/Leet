package LeetCode;

import java.util.*;

/**
 * Created by Administrator on 2018/4/9.
 */
public class ThreeNumberAdd {

    public  static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2 ; i++) {
            if (nums[i] > 0 || (i >= 1 && nums[i - 1] == nums[i] ))
                continue;
            for (int j = i + 1; j < nums.length -1 ; j ++) {
                if ((nums[i] + nums[j]) > 0 )
                    continue;
                for (int k = j + 1; k < nums.length ; k ++) {
                    if (nums[i] + nums[j] + nums[k] ==  0){
                        List<Integer> one = new ArrayList<>();
                        one.add(nums[i]);
                        one.add(nums[j]);
                        one.add(nums[k]);
                        if (!lists.contains(one)){
                            lists.add(one);
                        }
                    }
                }
            }
        }
        return lists;
    }
    public static void main(String[] args) {
        int a[] = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(a);
        for (List list : lists){
            System.out.println(list);
        }

    }
}
