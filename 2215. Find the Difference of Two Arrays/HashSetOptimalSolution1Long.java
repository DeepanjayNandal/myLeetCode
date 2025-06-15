// Time: O(n + m) — each element is visited once
// Space: O(n + m) — for storing sets and result

class HashSetOptimalSolution1Long {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // This will store the final answer: two lists inside a list
        List<List<Integer>> answer = new ArrayList<>();

        // Store unique elements from nums1 in set1
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1)
            set1.add(num);

        // Store unique elements from nums2 in set2
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2)
            set2.add(num);

        // Find common elements: set1 now contains only elements also in set2
        set1.retainAll(set2);

        // Note: Since set1 is now the common elements, we use it below
        Set<Integer> common = set1;  // rename for clarity

        // Prepare result1: elements from nums1 that are not in common
        Set<Integer> result1 = new LinkedHashSet<>(); // maintains input order
        for (int num : nums1) {
            if (!common.contains(num)) {
                result1.add(num); // keep only if not in both arrays
            }
        }

        // Prepare result2: elements from nums2 that are not in common
        Set<Integer> result2 = new LinkedHashSet<>();
        for (int num : nums2) {
            if (!common.contains(num)) {
                result2.add(num);
            }
        }

        // Add both result sets (converted to lists) to the final answer
        answer.add(new ArrayList<>(result1)); // elements unique to nums1
        answer.add(new ArrayList<>(result2)); // elements unique to nums2

        return answer;
    }
}

