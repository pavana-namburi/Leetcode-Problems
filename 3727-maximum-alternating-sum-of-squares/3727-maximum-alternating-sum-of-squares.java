class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] a = Arrays.stream(nums)
                .mapToLong(x -> (long) x)
                .map(x -> (x * x))
                .sorted()
                .toArray();

        int n = nums.length;
        long res = 0;
        int i = 0, j = n - 1;

        while (i < j) {
            res += a[j--];
            res -= a[i++];
        }

        if (i == j) {
            res += a[i];
        }
        return res;
    }
}