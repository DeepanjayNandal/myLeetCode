// Moves all 0s to the end while maintaining the order of non-zero elements.
// Time Complexity: O(n) — loops through array 3 times in total
// Space Complexity: O(n) — uses two extra ArrayLists
// Not inplace

class TimeEfficientButNotSpaceEfficientSolution {
    public void moveZeroes(int[] nums) {
        // Check if any zeroes exist in the array, store separately zeroes and other array elements
        boolean found = false;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> listOfZeroes = new ArrayList<>();
        for (int num : nums) {
            if (num == 0) {
                found = true;
                listOfZeroes.add(num);
            } else {
                list1.add(num);
            }
        }

        // If no zeroes found, return as it is
        if (found == false)
            return;

        // Combine both arraylists
        list1.addAll(listOfZeroes);

        // Replace existing nums with updated and combined arraylist
        for (int i = 0; i < list1.size(); i++) {
            nums[i] = list1.get(i);
        }
    }
}
