class Solution {
    public boolean checkDivisibility(int n) {
        int t=n;
        int p=1,s=0;
        while(t>0){
            int d=t%10;
            p*=d;
            s+=d;
            t/=10;
        }
        return n%(s+p)==0;
    }
}