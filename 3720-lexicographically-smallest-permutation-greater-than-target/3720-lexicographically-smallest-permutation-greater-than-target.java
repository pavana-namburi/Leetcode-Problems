class Solution {
    public String lexGreaterPermutation(String s, String t) {
        if (s.length() != t.length())
            return "";

        TreeMap<Character, Integer> tm = new TreeMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            tm.put(ch, tm.getOrDefault(ch, 0) + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        return compute(tm, t, sb, false) ? sb.toString() : "";
    }

    private boolean compute(TreeMap<Character, Integer> tm, String t, StringBuilder sb, boolean isAlreadyGreater) {
        if (sb.length() == t.length()) {
            return isAlreadyGreater;
        }

        int i = sb.length();
        char targetChar = t.charAt(i);

        for (char x : tm.keySet()) {
            if (tm.get(x) > 0) {
                if (!isAlreadyGreater && x < targetChar) {
                    continue; 
                }

                sb.append(x);
                tm.put(x, tm.get(x) - 1);

                boolean nextGreater = isAlreadyGreater || (x > targetChar);

                if (compute(tm, t, sb, nextGreater)) {
                    return true;
                }

                tm.put(x, tm.get(x) + 1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return false;
    }
}
