class HashSetCleanerOptimalSolution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Time: O(n + m) — for building sets and removing common elements
        // Space: O(n + m) — to store unique values and final result

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add all elements of nums1 to set1 (duplicates automatically removed)
        for (int num : nums1) set1.add(num);

        // Add all elements of nums2 to set2
        for (int num : nums2) set2.add(num);

        // Create a temporary copy of set1 to avoid modifying during set2 filtering
        Set<Integer> temp = new HashSet<>(set1);

        // Remove from set1 all elements that are also in set2 (common elements)
        set1.removeAll(set2);

        // Remove from set2 all elements that were in original set1
        set2.removeAll(temp);

        // Convert both sets to lists and add to the final result
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>(set1)); // Elements only in nums1
        answer.add(new ArrayList<>(set2)); // Elements only in nums2

        return answer;
    }
}
