class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n = tasks.length;
        int m = shifts.length;
        int[] ans = new int[m];
        
        long[] p = new long[n];
        p[0] = tasks[0];
        for (int i = 1; i < n; i++) {
            p[i] = p[i - 1] + tasks[i];
        }
        
        long tot = p[n - 1];
        long cur = 0;
        
        for (int j = 0; j < m; j++) {
            cur += shifts[j];
            
            if (cur >= tot) {
                ans[j] = 0;
                cur = 0;
            } else {
                int idx = Arrays.binarySearch(p, cur);
                int fin = (idx >= 0) ? (idx + 1) : -(idx + 1);
                ans[j] = n - fin;
            }
        }
        
        return ans;
    
    }
}