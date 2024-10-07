class BruteForceSolution {
    public void rotate(int[] nums, int k) {
        int temp, previous;
        int length = nums.length;
        k %= length;
        for (int i = 0; i < k; i++) {
            previous = nums[length - 1];
            for (int j = 0; j < length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }
}
