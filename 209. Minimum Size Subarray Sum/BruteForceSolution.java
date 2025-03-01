// Time Complexity = 0(n^2)

class BruteForceSolution {
    public int minSubArrayLen(int target, int[] nums) {
        int minimumSubArray = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum >= target) {
                    minimumSubArray = Math.min(minimumSubArray, j - i + 1);
                    break;
                }
            }
        }
        return minimumSubArray == Integer.MAX_VALUE ? 0 : minimumSubArray;
    }
}
