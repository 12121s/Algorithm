package leetcode.greedy;

public class No_121 {
    public static void main(String[] args) {
        int[] sample1 = new int[] {7,1,5,3,6,4};
        int[] sample2 = new int[] {7,6,4,3,1};

        System.out.println(maxProfit(sample1));
        System.out.println(maxProfit(sample2));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = -10000;
        int min = 20000;
        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i - 1]) min = prices[i - 1];
            int profit = prices[i] - min;
            if (maxProfit < profit) maxProfit = profit;
        }
        return Math.max(maxProfit, 0);
    }
}
