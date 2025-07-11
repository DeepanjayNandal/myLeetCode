// Time : 0(n)
// Space : 0(k) due to hashmap
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int start = 0;
        int maxLength = 0;
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char rightChar = s.charAt(end);
            freqMap.put(rightChar, freqMap.getOrDefault(rightChar, 0) + 1);

            // Check if count of any digit exceeds k
            while (freqMap.size() > k) {
                // Slide window and shrink window if count exceeds k
                char leftChar = s.charAt(start);
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                if (freqMap.get(leftChar) == 0) {
                    // Remove the character whose occurence frequency is 0 since we calculate the length of distinct characters by counting map's size 
                    freqMap.remove(leftChar);
                }
                start++;
            }

            // Update maxLength
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
