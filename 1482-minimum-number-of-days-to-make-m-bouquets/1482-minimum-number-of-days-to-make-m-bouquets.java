class Solution {
    public int minDays(int[] b, int m, int k) {
        int n=b.length;
        long max=Arrays.stream(b).max().getAsInt();
        long l=1,h=max,ans=-1;
        while(l<=h){
            long mid=l+(h-l)/2;
            int t=0,c=0;
            for(int i=0;i<n;i++){
                if(b[i]<=mid)
                    t++;
                else
                    t=0;
                if(t>=k){
                    t-=k;
                    c++;
                }
            }
            if(c<m){
                l=mid+1;
            }
            else{
                ans=mid;
                h=mid-1;
            }
        }
        return (int)ans;
    }
}