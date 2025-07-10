class SlidingWindowTemplateSolution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = Integer.MIN_VALUE;
        double windowSum = 0;
        int start = 0;
        
        // Iterate through the loop with a sliding window of
        // size k to caluclate the maximum average of a subarray
        for (int end = 0; end < nums.length; end++) {
            // Calculate the sum of the window;
            windowSum += nums[end];

            // Check if the sliding window is of size k
            if (end - start + 1 == k) {
                // Check maximum average
                maxAverage = Math.max(windowSum / k, maxAverage);

                windowSum -= nums[start];
                start++;
            }
        }
        return maxAverage;
    }
}
