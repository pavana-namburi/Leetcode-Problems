import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Set<Integer>> m = new HashMap<>();
        for (int[] x : reservedSeats) {
            m.computeIfAbsent(x[0], k -> new HashSet<>()).add(x[1]);
        }
        
        int res = 0;
        for (int r : m.keySet()) {
            Set<Integer> s = m.get(r);
            boolean l = !s.contains(2) && !s.contains(3) && !s.contains(4) && !s.contains(5);
            boolean rgt = !s.contains(6) && !s.contains(7) && !s.contains(8) && !s.contains(9);
            boolean mid = !s.contains(4) && !s.contains(5) && !s.contains(6) && !s.contains(7);
            
            if (l && rgt) res += 2;
            else if (l || rgt || mid) res += 1;
        }
        
        return res + (n - m.size()) * 2;
    }
}
