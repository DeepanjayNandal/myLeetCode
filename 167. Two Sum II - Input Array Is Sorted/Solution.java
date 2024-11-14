// Time : 0(n)
// space : 0(1)

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int length = numbers.length;
        int left = 0;
        int right = length - 1;
        for (int i = 1; i < length; i++) {
            if (numbers[left] + numbers[right] == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            }
        }
        return result;
    }
}
