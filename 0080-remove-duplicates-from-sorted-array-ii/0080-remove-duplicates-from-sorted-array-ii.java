class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,j=0,n=nums.length;
        int ele=nums[0],cnt=1;
        for(j=1;j<n;j++){
            if(ele==nums[j] && cnt<2){
                nums[i++]=nums[j];
                cnt++;
            }
            else if(ele!=nums[j]){
                ele=nums[j];
                nums[i++]=ele;
                cnt=1;
            }
            
        }
        return i;
    }
}