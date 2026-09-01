class Solution {
    public int maxScore(int[] a, int k) {
        int f[]=new int[k+1];
        int b[]=new int[k+1];
        int n=a.length,x=2;
        f[1]=a[0];b[1]=a[n-1];

        for(int i=1;i<k;i++){
            f[i+1]=f[i]+a[i];
        }

        for(int j=n-2;j>=n-k;j--){
            b[x]=a[j]+b[x-1];
            x++;
        }

        int res=0;
        for(int i=0;i<=k;i++){
            res=Math.max(res,f[i]+b[k-i]);
        }

        return res;
    }
}