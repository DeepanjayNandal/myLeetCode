class OptimalSolution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (nums[i] != nums[j]) {
                    return nums[i] - nums[j];
                } else {
                    return i - j;
                }
            }
        });

        int minIndex = n;
        int maxWidth = 0; 
        for (int i : indices) {
            maxWidth = Math.max(maxWidth, i - minIndex);
            minIndex = Math.min(minIndex, i);
        }
    return maxWidth;
    }
}
