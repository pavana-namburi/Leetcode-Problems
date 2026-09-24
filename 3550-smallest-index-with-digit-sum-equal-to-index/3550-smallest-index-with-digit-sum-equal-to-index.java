class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(csum(nums[i],i)){
                return i;
            }
        }

        return -1;
    }
    private boolean csum(int a,int s){
        int t=0;
        while(a>0){
            t+=a%10;
            a/=10;
            if(t>s)
                return false;
        }
        return t==s;
    }
}