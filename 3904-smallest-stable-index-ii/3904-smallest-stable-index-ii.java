class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int max[]=new int[n];
        int min[]=new int[n];
        int m1=nums[0],m2=nums[n-1];

        for(int i=0;i<n;i++){
            m1=Math.max(m1,nums[i]);
            max[i]=m1;
        }

        for(int i=n-1;i>=0;i--){
            m2=Math.min(m2,nums[i]);
            min[i]=m2;
        }

        for(int i=0;i<n;i++){
            if(max[i]-min[i]<=k)
                return i;
        }

        return -1;
    }
}