// Solution with time and space complexity as 0(n)
import java.util.Map.Entry;
class Solution {
    private HashMap<Integer, Integer> count(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }
        return count;
    }

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countElements = new HashMap<Integer, Integer>();
        countElements = count(nums);
        Entry<Integer, Integer> maxEntry = null;
        for (Entry<Integer, Integer> entry : countElements.entrySet()) {
            if(maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }
}
