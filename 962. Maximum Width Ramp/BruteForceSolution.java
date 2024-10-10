// problem link: https://leetcode.com/problems/maximum-width-ramp/?envType=daily-question&envId=2024-10-10
class BruteForceSolution {
    public int maxWidthRamp(int[] nums) {
        int maxWidth = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] <= nums[j]) {
                    maxWidth = Math.max(maxWidth, j - i);
                }
            }
        }
        return maxWidth;
    }
}
