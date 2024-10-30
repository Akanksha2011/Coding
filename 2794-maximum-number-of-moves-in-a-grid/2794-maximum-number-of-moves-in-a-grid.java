class Solution {
    public int maxMoves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxMoves = 0;
        
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                dp[i][j] = -1;
            }
        }
        for(int row = 0; row < m ; row++)
        {
            maxMoves = Math.max(maxMoves, dfs(row, 0, grid, dp));
        }
        return maxMoves;
    }
    private int dfs(int row, int col, int[][] grid, int[][] dp)
    {
        int m = grid.length;
        int n = grid[0].length;

        if(col == n-1)
        return 0;

        if(dp[row][col] != -1)
        return dp[row][col];
        
        int maxSteps = 0;

        int[][] directions = {{-1,1}, {0,1}, {1,1}};
        for(int[] dir : directions)
        {
            int newRow = row + dir[0];
            int newcol = col + dir[1];

            if(newRow >= 0 && newRow < m && newcol < n && grid[newRow][newcol] > grid[row][col])
            {
                maxSteps = Math.max(maxSteps, 1 + dfs(newRow, newcol, grid, dp));
            }
        }
        dp[row][col] = maxSteps;
        return dp[row][col];
    }
}