class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length,odd=0,even=0;
        for(int i=0;i<n;i++){
            if(nums1[i]%2!=0)
                odd++;
            else
                even++;
        }
        if(odd==n || even==n)
            return true;
        else if((odd+Math.min(odd,even))>=n || even+even/2+odd/2>=n)
            return true;
        return false;
    }
}