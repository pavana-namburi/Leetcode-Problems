class Solution {
    public int sumCounts(List<Integer> a) {
        int n=a.size();
        
        int s=0;
        for(int i=0;i<n;i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i;j<n;j++){
                hs.add(a.get(j));
                int t=hs.size();
                s+=(t*t);
            }
        }
        return s;
    }
}