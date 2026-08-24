class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int n=nums.length;
        int i=0,j=0,cs=0,res=Integer.MAX_VALUE;
        while(j<n){
            cs+=nums[j];
            if(nums[j]>=k)
                return 1;
            while(cs>=k){
                res=Math.min(res,j-i+1);
                cs-=nums[i];
                i++;
            }
            j++;
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}