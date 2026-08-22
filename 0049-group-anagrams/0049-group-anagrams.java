class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,List<String>> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char[] a=strs[i].toCharArray();
            Arrays.sort(a);
            String s=new String(a);
            hm.computeIfAbsent(s,x->new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(hm.values());
    }
}