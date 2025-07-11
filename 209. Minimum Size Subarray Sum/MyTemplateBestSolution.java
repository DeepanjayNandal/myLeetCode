// Time : 0(N)
// Space : 0(1)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < nums.length; end++) {
            // Store the size of window
            windowSum += nums[end];

            while (windowSum >= target) {
                // Store the minimum length
                minLength = Math.min(minLength, end - start + 1);

                // Shrink the subarray
                windowSum -= nums[start];
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;            
    }
}
