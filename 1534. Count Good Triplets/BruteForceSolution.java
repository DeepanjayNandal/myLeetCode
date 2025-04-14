class BruteForceSolution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int length = arr.length;
        if (length == 0) return 0;

        int output = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            output++;
                            // List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k]);
                            // System.out.println("Triplet=== " + list);
                        }
                    }
                }
            }
        }
        return output;
    }
}
