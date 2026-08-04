class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Arrays.stream(nums).min().orElse(nums[0]);
        int max=Arrays.stream(nums).max().orElse(nums[0]);
        int n=max-min+1;
        int a[]=new int [n];
        for(int i:nums){
            a[i-min]++;
        }

        List<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i]==0)
                al.add(min+i);
        }

        return al;
    }
}