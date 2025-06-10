// Time Complexity: 0(n - k + 1) -> roughly 0(n)
// Space Complexity: 0(1)

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = Double.NEGATIVE_INFINITY;
        int length = nums.length;

        for (int i = 0; i <= length - k; i++) {
            double sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            maxAverage = Math.max(maxAverage, (sum / k));
        }
        return maxAverage;
    }
}
