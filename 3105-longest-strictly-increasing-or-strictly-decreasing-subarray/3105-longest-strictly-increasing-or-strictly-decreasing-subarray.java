class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int cnt=1,n=nums.length;
        int res=1;

        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                cnt++;
            }
            else{
                res=Math.max(res,cnt);
                cnt=1;
            }
        }
        res=Math.max(res,cnt);
        
        cnt=1;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                cnt++;
            }
            else{
                res=Math.max(res,cnt);
                cnt=1;
            }
        }
        res=Math.max(res,cnt);
        return res;
    }
}