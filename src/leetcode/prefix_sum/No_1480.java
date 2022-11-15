package leetcode.prefix_sum;

import java.util.Arrays;

public class No_1480 {
    // 1480. Running Sum of 1d Array
    // Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    // Return the running sum of nums.
    public static void main(String[] args) {
        int[] num01 = {1,2,3,4};
        int[] num02 = {1,1,1,1,1};
        int[] num03 = {3,1,2,10,1};

        No_1480 q = new No_1480();
        System.out.println(Arrays.toString(q.runningSum(num01)));
        System.out.println(Arrays.toString(q.runningSum(num02)));
        System.out.println(Arrays.toString(q.runningSum(num03)));
    }

    /* result
    * Runtime: 1 ms, faster than 55.95% of Java online submissions for Running Sum of 1d Array.
    * Memory Usage: 43.6 MB, less than 17.86% of Java online submissions for Running Sum of 1d Array.
    * */
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
