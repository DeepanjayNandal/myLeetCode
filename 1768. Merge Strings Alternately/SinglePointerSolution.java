class SinglePointerSolution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int m = word1.length();
        int n = word2.length();

        for (int i = 0; i < Math.max(m,n); i++) {
            if (i < m) {
                result.append(word1.charAt(i));
            }
            if (i < n) {
                result.append(word2.charAt(i));
            }
        }

        return result.toString();
    }
}
