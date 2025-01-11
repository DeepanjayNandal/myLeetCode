// Time complexity : 0(N^2)
// Space : 0(N^2)

class HashMapSolutionN2 {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                k = 0 - nums[i] - nums[j];
                if (map.containsKey(k)) {
                    set.add(Arrays.asList(k, nums[i], nums[j]));
                }
            }
            map.put(nums[i], i);
            k++;
        }
        return new ArrayList<>(set);
    }
}
