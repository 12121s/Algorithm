package leetcode.prefix_sum;

import java.util.Arrays;

public class No_724 {
    // 724. Find Pivot Index
    // Given an array of integers nums, calculate the pivot index of this array.
    //The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
    public static void main(String[] args) {
        int[] num01 = {1,7,3,6,5,6};
        int[] num02 = {1,2,3};
        int[] num03 = {2,1,-1};

        No_724 q = new No_724();
        System.out.println(q.pivotIndex(num01));
        System.out.println(q.pivotIndex(num02));
        System.out.println(q.pivotIndex(num03));
    }

    /* result
    * Runtime: 1 ms, faster than 55.95% of Java online submissions for Running Sum of 1d Array.
    * Memory Usage: 43.6 MB, less than 17.86% of Java online submissions for Running Sum of 1d Array.
    * */
    public int my_pivotIndex(int[] nums) { // 누적합으로 해보려고 했는데 안됨
        int[] left_sum = new int[nums.length + 1];
        int[] right_sum = new int[nums.length + 1];

        for (int i = 1; i < left_sum.length; i++) {
            left_sum[i] = nums[i - 1] + left_sum[i - 1];
            right_sum[i] = nums[nums.length - i] + right_sum[i - 1];
        }

        System.out.println(Arrays.toString(left_sum));
        System.out.println(Arrays.toString(right_sum));

        for (int i = 1; i < left_sum.length; i++) {
            if (left_sum[i] == right_sum[i - 1])
                return i;
        }
        return -1;
    }

    /* result
    * Runtime: 7 ms, faster than 21.01% of Java online submissions for Find Pivot Index.
    * Memory Usage: 52 MB, less than 66.43% of Java online submissions for Find Pivot Index.
    * */
    public int pivotIndex(int[] nums) { // 포인터 + 슬라이딩 도전
        int total_sum = Arrays.stream(nums).sum(); // 배열 전체 합 - pivot 기준 오른쪽 구간의 합 초기값
        int left_sum = 0; // pivot 기준 왼쪽 구간의 합 초기값
        int pivot = 0; // 구간을 나누는 기준 숫자의 index

        for (int i = 0; i < nums.length; i++) {
            pivot = i;
            total_sum -= nums[i]; // 오른쪽 구간 -1
            if (left_sum == total_sum) // 비교
                return pivot;
            else left_sum += nums[i]; // 왼쪽 구간 +1
        }
        return -1;
    }
}
