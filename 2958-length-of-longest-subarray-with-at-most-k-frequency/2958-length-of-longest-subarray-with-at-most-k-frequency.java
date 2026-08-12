class Solution {
    public int maxSubarrayLength(int[] a, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int j=0,c=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
            while(hm.get(a[i])>k){
                hm.put(a[j],hm.get(a[j])-1);
                if(hm.get(a[j])==0)
                    hm.remove(a[j]);
                j++;
            }
            c=Math.max(c,i-j+1);
        }
        return c;
    }
}