class Solution {
    public int missingInteger(int[] nums) {

        int s=nums[0];
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(nums[0],1);

        boolean f=true;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1 && f){
               s+=nums[i];
            }
            else
                f=false;
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);   
        }

        while(true){
            if(!hm.containsKey(s))
                return s;
            s++;
        }

    }
}