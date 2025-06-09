// Time : 0(N + M)
// Space : 0(N + M)

class Solution1ArrayList {
    public String mergeAlternately(String word1, String word2) {
        ArrayList<Character> output = new ArrayList<>();
        int i = 0;
        int j = 0;
        int word1Length = word1.length();
        int word2Length = word2.length();

        while (i < word1Length || j < word2Length) {
            if (i < word1Length) output.add(word1.charAt(i));
            if (j < word2Length) output.add(word2.charAt(j));
            i++;
            j++;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : output) {
            sb.append(ch);
        }

        String result = sb.toString();
        return result;
    }
}
