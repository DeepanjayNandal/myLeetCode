class Solution {
    public boolean isSubsequence(String s, String t) {
        int leftBound = s.length(), rightBound = t.length();
        int pLeft = 0, pRight = 0;
        while (pLeft < leftBound && pRight < rightBound) {
            if (s.charAt(pLeft) == t.charAt(pRight)) {
                pLeft++;
            }
            pRight++;
        }
        return pLeft == leftBound;
    }
}
