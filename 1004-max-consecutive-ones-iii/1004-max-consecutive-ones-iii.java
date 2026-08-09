class Solution {
    public int longestOnes(int[] nums, int k) {
        int res=0,zc=0,l=0;
        int n=nums.length;
        for(int r=0;r<n;r++){
            while(zc>k){
                if(nums[l]==0)
                    zc--;
                l++;
            }
            if(nums[r]==0)
                zc++;
            if(zc<=k)
                res=Math.max(res,r-l+1);
        }
        return res;
    }
}