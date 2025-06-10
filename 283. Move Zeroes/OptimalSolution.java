 // One-liner: Moves all 0s to the end of the array while preserving the order of non-zero elements.
 // Time Complexity: O(n) — traverses the array twice (once for shifting, once for filling zeros)
 // Space Complexity: O(1) — in-place, no extra data structures used

class OptimalSolution {
    public void moveZeroes(int[] nums) {
        // Modify nums in place
        int length = nums.length;
        int j = 0; // A pointer to track available spaces for assigning value of nums[i] to nums[j] if i > j and nums[i] != 0
        for (int i = 0; i < length; i++) {
            if ((nums[i] != 0)) {
                nums[j] = nums[i];
                j++;
            }
        }

        while (j < length) {
            nums[j++] = 0;
        }
    }
}
