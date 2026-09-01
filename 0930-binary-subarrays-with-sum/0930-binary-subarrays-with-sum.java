class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       return atMost(nums,goal)-atMost(nums,goal-1);
    }
    private int atMost(int nums[],int goal){
         int n=nums.length,i=0,res=0;
        int cnt=0;

        for(int j=0;j<n;j++){
            if(nums[j]==1)
                cnt++;
            while(i<=j && cnt>goal){
                if(nums[i]==1)
                    cnt--;
                i++;
            }
            res+=(j-i+1);   
        }

        return res;
    }
}