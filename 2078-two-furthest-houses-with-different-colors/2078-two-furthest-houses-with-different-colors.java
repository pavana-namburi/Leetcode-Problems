class Solution {
    public int maxDistance(int[] a) {
        int n=a.length,res=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(a[j]!=a[i]){
                    res=Math.max(res,j-i);
                    break;
                }
            }
        }
        return res;

    }
}