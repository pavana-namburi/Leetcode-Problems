class Solution {
    public boolean findSubarrays(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        int cs=nums[0]+nums[1];
        hm.put(cs,hm.getOrDefault(cs,0)+1);
        for(int i=2;i<n;i++){
            cs+=nums[i];
            cs-=nums[i-2];
            hm.put(cs,hm.getOrDefault(cs,0)+1);
            if(hm.get(cs)>=2)
                return true;
        }
        return false;
    }
}