// Time complexity = 0(n)
// Space = 0(1)

class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int ones = 0;
        int zeroes = 0;
        int maxSize = 0;

        for (int end = 0; end < nums.length; end++) {
            // Calculate numbers of ones and zeroes
            if (nums[end] == 1) {
                ones++;
            } else {
                zeroes++;
            }

            // Make sure if zeroes < k since we can only make k changes
            if (zeroes <= k) {
                maxSize = Math.max(ones + zeroes, maxSize);
            } else {
                // Slide the window by one index in the array
                if (nums[start] == 1) {
                    ones--;
                } else {
                    zeroes--;
                }
                start++;
            }
        }

        return maxSize;
    }
}
