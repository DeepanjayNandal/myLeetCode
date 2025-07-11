// Time : 0(n)
// Space : 0(1)
// Better coz of while loop, if else method in prevous solution can miss a few iterations due to repition of zeroes

class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int zeroes = 0;
        int maxSize = 0;

        for (int end = 0; end < nums.length; end++) {
            // Calculate numbers of ones and zeroes
            if (nums[end] == 0) {
                zeroes++;
            }

            // Make sure if zeroes < k since we can only make k changes
            while (zeroes > k) {
                if (nums[start] == 0) zeroes--;
                start++;
            }

            // Update the maxSize
            maxSize = Math.max(maxSize, end - start + 1);
        }

        return maxSize;
    }
}
