class Solution {
    public int maxProfit(int[] prices) {
        int largestDifference = 0;
        int minSoFar = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minSoFar) {
                minSoFar = prices[i];
            } else {
                largestDifference = Math.max(largestDifference, prices[i] - minSoFar);
            }
        }
        return largestDifference;
    }
}
