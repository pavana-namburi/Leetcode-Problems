class Solution {
    public int closedIsland(int[][] g) {
        int n = g.length, m = g[0].length;

        int res = 0;
        boolean vis[][] = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && g[i][j] == 0) {
                    if (dfs(i, j, n, m, vis, g))
                        res++;
                }
            }
        }
        return res;
    }

    private boolean dfs(int i, int j, int n, int m, boolean vis[][], int g[][]) {

        if (i >= n || i < 0 || j >= m || j < 0)
            return false;

        if (g[i][j] == 1 || vis[i][j])
            return true;

        vis[i][j] = true;

        boolean down  = dfs(i + 1, j, n, m, vis, g);
        boolean up    = dfs(i - 1, j, n, m, vis, g);
        boolean right = dfs(i, j + 1, n, m, vis, g);
        boolean left  = dfs(i, j - 1, n, m, vis, g);

        return down & up & right & left;
    }
}