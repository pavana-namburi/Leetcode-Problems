class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int i=0,j=0;
        if(n==1)
            return 1;

        for(int k=0;k<n;k++){
            if(nums[k]<nums[i]){
                i=k;
            }

            if(nums[k]>nums[j]){
                j=k;
            }
        }

        int t1=Math.max(i+1,j+1);
        int t2=Math.max(n-i,n-j);
        int t3=i+1+n-j;
        int t4=j+1+n-i;

        return Math.min(t1,Math.min(t2,Math.min(t3,t4)));
    }
}