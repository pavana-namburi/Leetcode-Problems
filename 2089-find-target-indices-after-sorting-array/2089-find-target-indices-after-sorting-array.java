class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> al=new ArrayList<>();
        int n=nums.length;
        int c=0,cnt=0;

        for(int i=0;i<n;i++){
            if(nums[i]<target)
                cnt++;
            if(nums[i]==target)
                c++;
        }

        for(int i=0;i<c;i++)
            al.add(cnt+i);

        return al;
    }
}