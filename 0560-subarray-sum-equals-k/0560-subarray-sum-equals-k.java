class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length,cs=0,c=0;
        hm.put(0,1);
        for(int i=0;i<n;i++){
            cs+=nums[i];
            if(hm.containsKey(cs-k))
                c+=hm.get(cs-k);
            hm.put(cs,hm.getOrDefault(cs,0)+1);
        }
        return c;
    }
}