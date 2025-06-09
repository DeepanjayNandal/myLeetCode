class TwoPointerSolution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;
        int word1Length = word1.length();
        int word2Length = word2.length();

        while (i < word1Length || j < word2Length) {
            if (i < word1Length) result.append(word1.charAt(i++));
            if (j < word2Length) result.append(word2.charAt(j++));
        }

        return result.toString();
    }
}
