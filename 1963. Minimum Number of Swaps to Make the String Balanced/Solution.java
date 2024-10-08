class Solution {
    public int minSwaps(String s) {
        int unBalanced = 0;
        int openingCount = 0;
        char closingBracket = ']';
        char openingBracket = '[';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == openingBracket) {
                openingCount++;
            } else if (s.charAt(i) == closingBracket) {
                if (openingCount == 0) {
                    unBalanced++;
                } else {
                    openingCount--;
                }
            }
        }
        return ((unBalanced + 1) / 2);
    }
}
