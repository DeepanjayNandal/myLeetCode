class BruteForceSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                for (int c = b + 1; c < nums.length; c++) {
                    if (nums[a] + nums[b] + nums[c] == 0) {
                        set.add(Arrays.asList(nums[a], nums[b], nums[c]));
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
