class Solution {
    public int minAddToMakeValid(String s) {
        int minAddsRequired = 0;
        int openingCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openingCount++;
            } else {
                if (openingCount > 0) {
                    openingCount--;
                } else {
                    minAddsRequired++;
                }
            }
        }
        return minAddsRequired + openingCount;
    }
}
