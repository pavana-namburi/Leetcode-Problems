class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size(),res=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            int sum=0, cnt=0;
            for(int j=i;j<n;j++){
                sum+=nums.get(j);
                cnt++;
                if(cnt<l)
                    continue;
                if(cnt>r)
                    break;
                if(sum>0)
                    res=Math.min(res,sum);
            }
        }

        return res==Integer.MAX_VALUE?-1:res;
    }
}