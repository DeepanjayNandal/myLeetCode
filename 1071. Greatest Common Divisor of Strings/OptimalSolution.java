// Time Complexity: O(m + n) — uses string concatenation check and Euclidean GCD on lengths (fastest approach)
class OptimalSolution {
    // Optimal Solution
    private int gcd(int x, int y) {
        // Computes GCD using Euclidean Algorithm: gcd(a, b) = gcd(b, a % b)
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public String gcdOfStrings(String str1, String str2) {
        // Check if they have non zero GCD String
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Get gcd
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
}
