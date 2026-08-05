class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] edges) {
       
        List<List<Integer>> g=new ArrayList<>();
        List<List<Integer>> in=new ArrayList<>();

        for(int i=0;i<n;i++){
            g.add(new ArrayList<>());
            in.add(new ArrayList<>());
        }
        
        for(int x[]:edges){
            g.get(x[0]).add(x[1]);
            in.get(x[1]).add(x[0]);
        }

        boolean vis[]=new boolean[n];
        dfs(k,n,g,vis);

        boolean canRemove=true;
        for(int i=0;i<n;i++){
            if(vis[i]){
                for(int j:in.get(i)){
                    if(vis[j]!=true){
                        canRemove=false;
                        break;
                    }
                }
            }
        }

        List<Integer> res=new ArrayList<>();
        if(canRemove){
            for(int i=0;i<n;i++){
                if(!vis[i])
                    res.add(i);
            }
            return res;
        }

        for(int i=0;i<n;i++){
            res.add(i);
        }
        return res;

    }
    private void dfs(int i,int n,List<List<Integer>> g,boolean vis[]){
        if(i>=n)
            return;
        vis[i]=true;
        for(int x:g.get(i)){
            if(!vis[x])
                dfs(x,n,g,vis);
        }
    }
}