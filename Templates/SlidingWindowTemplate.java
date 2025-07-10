public static void main(String[] args) {
    int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
    int k = 4;

    int windowSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int start = 0;

    for (int end = 0; end < arr.length; end++) {
        windowSum += arr[end];

        if (end - start + 1 == k) {
            maxSum = Math.max(maxSum, windowSum);
            windowSum -= arr[start];
            start++;
        }
    }

    System.out.println("Max sum of window size " + k + " is: " + maxSum);
}
