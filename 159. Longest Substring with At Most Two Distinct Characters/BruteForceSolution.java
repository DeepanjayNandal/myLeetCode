class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int length = s.length();
        if (length == 0)
            return 0;

        int maxLen = 0;

        for (int i = 0; i < length; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < length; j++) {
                char currentChar = s.charAt(j);
                map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
                if (map.size() <= 2) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else {
                    break;
                }
            }
        }
        return maxLen;
    }
}
