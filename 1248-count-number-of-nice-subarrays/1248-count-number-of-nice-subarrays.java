class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        return atMost(nums,k,n)-atMost(nums,k-1,n);
    }
    private int atMost(int[] nums,int k,int n){
        int i=0,res=0,cnt=0;

        for(int j=0;j<n;j++){
            if((nums[j]&1)==1)
                cnt++;
            while(cnt>k){
                if(nums[i]%2==1)
                    cnt--;
                i++;
            }
            res+=(j-i+1);
        }

        return res;
    }
}