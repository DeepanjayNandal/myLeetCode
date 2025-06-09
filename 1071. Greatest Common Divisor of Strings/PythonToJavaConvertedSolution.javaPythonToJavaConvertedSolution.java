// Time: O(Min(L1,L2)∗(L1+L2))
// Space: O(L1+L2)

class PythonToJavaConvertedSolution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // Check from largest value of n to smallest if that value divides both m and n
        for (int l = Math.min(len1, len2); l >= 1; l--) {
            if (isDivisor(str1, str2, len1, len2, l)) {
                return str1.substring(0, l);
            }
        }
        return "";
    }

    private boolean isDivisor(String str1, String str2, int len1, int len2, int l) {
        if (len1 % l != 0 || len2 % l != 0) {
            return false;
        }

        String base = str1.substring(0, l);
        int f1 = len1 / l;
        int f2 = len2 / l;

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < f1; i++)
            sb1.append(base);
        for (int i = 0; i < f2; i++)
            sb2.append(base);

        return sb1.toString().equals(str1) && sb2.toString().equals(str2);
    }
}
