// Time complexity : 0(n) ; space complexity : 0(n) ; execution time 15ms, can be improved
class Solution1 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }
        Integer count = 0;
        for (char d : ransomNote.toCharArray()) {
            count = magazineMap.get(d);
            if (count == null) {
                return false;
            }
            if (count > 1) {
                magazineMap.put(d, count - 1);
            } else if (count == 1) {
                magazineMap.remove(d);
            }
        }
        return true;
    }
}
