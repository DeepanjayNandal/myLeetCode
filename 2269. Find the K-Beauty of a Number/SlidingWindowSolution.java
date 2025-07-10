// Time : 0(n*k)
// Space : 0(k)
class Solution {
    public int divisorSubstrings(int num, int k) {
        // Convert num into an array of characters
        String s = String.valueOf(num);
        int output = 0;

        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i , i + k);
            int val = Integer.parseInt(sub);

            if (sub.length() == k) {
                if (val != 0 && num % val == 0) {
                    output++;
                }
            }
        }
        return output;
    }
}
