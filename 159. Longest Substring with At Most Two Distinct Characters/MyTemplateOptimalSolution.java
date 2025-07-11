class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxLength = Integer.MIN_VALUE;

        for (int end = 0; end < s.length(); end++) {
            // Store the character in the hashmap to count its frequency
            char rightChar = s.charAt(end);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            while (map.size() > 2) {
                // Reduce the value of the leftchar key by 1
                char leftChar = s.charAt(start);
                map.put(leftChar, map.get(leftChar) - 1);

                // Remove the key if its value is 0
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
