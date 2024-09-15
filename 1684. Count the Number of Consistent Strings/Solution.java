class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> allowedSet = new HashSet<Character>();
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }
        int output = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    isConsistent = false;
                }
            }
            if (isConsistent) {
                output++;
            }
        }
        return output;
    }
}
