// Time: 0(n)
// Space: 0(1)
class Solution {
    public int divisorSubstrings(int num, int k) {
        char[] digits = String.valueOf(num).toCharArray();
        int output = 0;
        int start = 0;
        int power = (int) Math.pow(10, k - 1);
        int windowSize = 0;

        for (int end = 0; end < digits.length; end++) {
            windowSize = windowSize * 10 + (digits[end] - '0');

            if (end - start + 1 == k) {
                if (windowSize != 0 && num % windowSize == 0) {
                    output++;
                }

                windowSize = windowSize % power;
                start++;
            }
        }
        return output;
    }
}
