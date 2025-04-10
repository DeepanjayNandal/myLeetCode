
import static java.lang.Math.max;

class OptimalSolution1 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;

        int maxLen = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            map.put(currentChar, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
