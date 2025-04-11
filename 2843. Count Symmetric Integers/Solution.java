// Time Complexity: 0(n)

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int output = 0;
        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) {
                output++;
            }
        }
        return output;
    }

    public boolean isSymmetric(int num) {
        if (num < 0) {
            return false;
        }

        String s = String.valueOf(num);
        int length = s.length();

        if (length % 2 != 0)
            return false;

        int mid = length / 2;

        int firstSum = 0;
        for (int i = 0; i < mid; i++) {
            firstSum += Character.getNumericValue(s.charAt(i));
        }

        int endSum = 0;
        for (int i = mid; i < length; i++) {
            endSum += Character.getNumericValue(s.charAt(i));
        }

        return firstSum == endSum;
    }
}
