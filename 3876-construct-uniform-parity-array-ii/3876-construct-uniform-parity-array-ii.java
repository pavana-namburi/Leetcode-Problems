class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length,odd=0,even=0,m=Integer.MAX_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums1[i]%2!=0){
                odd++;
                m=Math.min(m,nums1[i]);
            }
            else
                even++;
            min=Math.min(min,nums1[i]);
        }
        if(odd==0 || even==0)
            return true;
        if(odd>0 && even>0){
            boolean ok=true;
            for(int x:nums1){
                if(x%2==0 && x<=m){
                    ok= false;
                    break;
                }
            }
            if (ok) return true;
        }
        return false;
    }
}