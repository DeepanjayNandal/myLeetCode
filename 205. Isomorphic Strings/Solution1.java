// link : https://leetcode.com/problems/isomorphic-strings/?envType=study-plan-v2&envId=top-interview-150
class Solution1 {
    public boolean isIsomorphic(String s, String t) {
        int[] mapStoT = new int[256];
        int[] mapTtoS = new int[256];
        Arrays.fill(mapStoT, -1);
        Arrays.fill(mapTtoS, -1);

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapStoT[c1] == -1 && mapTtoS[c2] == -1) {
                mapStoT[c1] = c2;
                mapTtoS[c2] = c1;
            } else if (!(mapStoT[c1] == c2 && mapTtoS[c2] == c1)) {
                return false;
            }
        }
        return true;

    }
}
