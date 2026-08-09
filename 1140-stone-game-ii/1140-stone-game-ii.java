class Solution {
    public int stoneGameII(int[] piles) {
        int n=piles.length;
        int dp[][]=new int[n][n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        int sufix[] = new int[n+1];
        for(int i=n-1;i>=0;i--){
            sufix[i]=sufix[i+1]+piles[i];
        }

        return compute(0,1,dp,sufix,n);
    }
    private int compute(int i,int m,int dp[][],int sufix[],int n){
        if(i>=n)
            return 0;

        if(n-i<=2*m){
            return sufix[i];
        }

        if(dp[i][m]!=-1)
            return dp[i][m];
        
        int maxi=0;
        for(int x=1;x<=2*m;x++){
            int t=sufix[i]-compute(i+x,Math.max(m,x),dp,sufix,n);
            maxi=Math.max(maxi,t);
        }

        return dp[i][m]=maxi;
    }
}