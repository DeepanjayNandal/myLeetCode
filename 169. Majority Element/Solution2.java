// Shortest solution with time complexity O(nlgn) and space complexity O(1) or (O(n))
class Solution2 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
