class Solution {
    public List<String> invalidTransactions(String[] t) {
        int n = t.length;
        List<String> res = new ArrayList<>();
        boolean[] isInvalid = new boolean[n];
        
        String[] names = new String[n];
        int[] times = new int[n];
        int[] amounts = new int[n];
        String[] cities = new String[n];
        
        for (int i = 0; i < n; i++) {
            String[] parts = t[i].split(",");
            names[i] = parts[0];
            times[i] = Integer.parseInt(parts[1]);
            amounts[i] = Integer.parseInt(parts[2]);
            cities[i] = parts[3];
            
            if (amounts[i] > 1000) {
                isInvalid[i] = true;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (names[i].equals(names[j]) && !cities[i].equals(cities[j])) {
                    if (Math.abs(times[i] - times[j]) <= 60) {
                        isInvalid[i] = true;
                        isInvalid[j] = true;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (isInvalid[i]) {
                res.add(t[i]);
            }
        }
        return res;
    }
}
