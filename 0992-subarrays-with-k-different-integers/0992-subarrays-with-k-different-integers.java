import java.util.*;

class Solution {
    public int subarraysWithKDistinct(int[] a, int k) {
        return atmost(a, k) - atmost(a, k - 1);
    }

    private int atmost(int[] a, int k) {
        int n = a.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int j = 0, res = 0;

        for (int i = 0; i < n; i++) {
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);

            while (hm.size() > k) {
                hm.put(a[j], hm.get(a[j]) - 1);
                if (hm.get(a[j]) == 0) {
                    hm.remove(a[j]);
                }
                j++;
            }

            res += (i - j + 1);
        }
        return res;
    }
}
