class BruteForceSolution {
    // Helper method to find elements in arr1 that are not in arr2
    private List<Integer> getUnique(int[] arr1, int[] arr2) {
        Set<Integer> result = new HashSet<>();

        for (int num1 : arr1) {
            boolean found = false;
            for (int num2 : arr2) {
                if (num1 == num2) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(num1); // ensures uniqueness
            }
        }

        return new ArrayList<>(result);
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Time: O(n * m), Space: O(n + m)
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(getUnique(nums1, nums2)); // Elements only in nums1
        answer.add(getUnique(nums2, nums1)); // Elements only in nums2
        return answer;
    }
}
