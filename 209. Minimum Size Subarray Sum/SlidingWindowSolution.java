// Time complexity = 0(n)

class SlidingWindowSolution {
    public int minSubArrayLen(int target, int[] nums) {
        int minimumSubArray = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minimumSubArray = Math.min(minimumSubArray, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minimumSubArray == Integer.MAX_VALUE ? 0 : minimumSubArray;
    }
}
