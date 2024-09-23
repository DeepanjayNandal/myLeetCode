class Solution {
    private int countNumbers(int prefix, int n) {
        long first = prefix;
        long last = prefix + 1;
        int count = 0;
        while (first <= n) {
            count += Math.min(n + 1, last) - first;
            first *= 10;
            last *= 10;
        }
        return count;
    }

    public int findKthNumber(int n, int k) {
        if (k == 1) {
            return 1;
        }
        int current = 1;
        k--;
        while (k > 0) {
            int count = countNumbers(current, n);
            if (count <= k) {
                current++;
                k -= count;
            } else {
                current *= 10;
                k--;
            }
        }
        return current;
    }
}
