class Solution {
    public int countServers(int[][] g) {
        int n=g.length,m=g[0].length,cnt=0;

        HashMap<Integer,Integer> row=new HashMap<>();
        HashMap<Integer,Integer> col=new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(g[i][j]==1){
                    cnt++;
                    row.put(i,row.getOrDefault(i,0)+1);
                    col.put(j,col.getOrDefault(j,0)+1);
                }
            }
        }

        int ios=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(g[i][j]==1 && row.get(i)<=1 && col.get(j)<=1)
                    ios++;
            }
        }
        
        return cnt-ios;
    }
}