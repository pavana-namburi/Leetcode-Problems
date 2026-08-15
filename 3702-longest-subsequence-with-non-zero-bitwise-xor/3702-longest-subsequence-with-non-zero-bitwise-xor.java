class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length,xor=0;
        boolean hasValue=false;

        for(int i=0;i<n;i++){
            xor^=nums[i];
            if(nums[i]!=0)
                hasValue=true;
        }

        if(xor!=0)
            return n;
        
        return hasValue?n-1:0;
    }
}