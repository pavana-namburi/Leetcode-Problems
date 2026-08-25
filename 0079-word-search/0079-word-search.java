class Solution {
    public boolean exist(char[][] b, String word) {
        int s=word.length();
        int n=b.length,m=b[0].length;
        boolean vis[][]=new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(b[i][j]==word.charAt(0)){
                    if(compute(i,j,0,vis,b,word,n,m,s))
                        return true;
                }
            }
        }

        return false;
    }
    private boolean compute(int i,int j,int idx,boolean vis[][],char b[][],String w,int n,int m,int s){
        if(idx==s)
            return true;

        if(i<0 || i>=n || j<0 ||j>=m || b[i][j]!=w.charAt(idx) || vis[i][j])
            return false;
        
        vis[i][j]=true;

        if(compute(i-1,j,idx+1,vis,b,w,n,m,s) || 
            compute(i,j+1,idx+1,vis,b,w,n,m,s) ||
            compute(i+1,j,idx+1,vis,b,w,n,m,s) ||
            compute(i,j-1,idx+1,vis,b,w,n,m,s) )
            return true;

        vis[i][j]=false;
        return false;
    }
}