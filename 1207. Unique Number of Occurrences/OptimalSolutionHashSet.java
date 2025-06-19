// Time : 0(n)
// Space : 0(n)
class OptimalSolutionHashSet {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for (Integer value : map.values()) {
            if (!set.add(value)) {
                return false;
            }
        }
        return true;
    }
}
