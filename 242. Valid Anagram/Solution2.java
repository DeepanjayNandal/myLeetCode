// Time complexity: 0(n + k)
// Space complexity: 0(1 + k)
// Here k = 26, hence 0(n) and 0(1) respectively

class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int arraySize = 26;
        int[] array1 = new int[arraySize];
        int[] array2 = new int[arraySize];
        for (int i = 0; i < s.length(); i++) {
            array1[s.charAt(i) - 'a']++;
            array2[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < arraySize; i++) {
            if (array1[i] != array2[i])
                return false;
        }
        return true;
    }
}
