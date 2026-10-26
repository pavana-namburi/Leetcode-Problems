class Solution {
    public int countIslands(int[][] g, int k) {
        int n=g.length,m=g[0].length;
        int res=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(g[i][j]!=0){
                    long sum=dfs(i,j,n,m,g);
                    System.out.println(sum);
                    if(sum%k==0)
                        res++;
                }
            }
        }

        return res;
    }
    private long dfs(int i,int j,int n,int m,int g[][]){
        if(i<0 || i>=n || j<0 || j>=m)
            return 0;

        if(g[i][j]==0) 
            return 0;

        long sum=g[i][j];
        g[i][j]=0;

        return sum+dfs(i+1,j,n,m,g)+
                dfs(i-1,j,n,m,g)+
                dfs(i,j-1,n,m,g)+
                dfs(i,j+1,n,m,g);
        
    }
}