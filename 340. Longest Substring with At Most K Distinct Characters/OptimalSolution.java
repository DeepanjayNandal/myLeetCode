class OptimalSolution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int length = s.length();
        if (length == 0)
            return 0;

        int left = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < length; right++) {
            char currentChar = s.charAt(right);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }

            if (map.size() <= k) {
                max = Math.max(max, right - left + 1);
            }
        }
        return max;
    }
}
