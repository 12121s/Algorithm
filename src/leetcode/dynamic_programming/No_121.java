package leetcode.dynamic_programming;

public class No_121 {
    public static void main(String[] args) {
        No_121 problem = new No_121();
        System.out.println(problem.maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(problem.maxProfit(new int[] {7,6,4,3,1}));
    }

    /**
     * Runtime: 4 ms, faster than 56.23% of Java online submissions for Best Time to Buy and Sell Stock.
     * Memory Usage: 83.8 MB, less than 38.56% of Java online submissions for Best Time to Buy and Sell Stock.
     * */
    public int maxProfit(int[] prices) {
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
