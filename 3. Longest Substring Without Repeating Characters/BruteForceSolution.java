// Time complexity : 0(n^2)
// Space : 0(n)
class BruteForceSolution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                if (map.containsKey(s.charAt(j)))
                    break;
                maxlen = Math.max(maxlen, j - i + 1);
                map.put(s.charAt(j), 1);
            }
        }
        return maxlen;
    }
}
