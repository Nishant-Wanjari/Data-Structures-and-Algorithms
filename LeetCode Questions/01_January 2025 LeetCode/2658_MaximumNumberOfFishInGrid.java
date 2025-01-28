class Solution {
    public int findMaxFish(int[][] grid) {
        int maxFish = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0) {
                    maxFish = Math.max(maxFish, dfs(grid, i, j));
                }
            }
        }

        return maxFish;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }

        int caughtFish = grid[i][j];
        grid[i][j] = 0;  // Mark the cell as visited

        // Explore the 4 possible directions (down, up, right, left)
        int fishCount = caughtFish 
                        + dfs(grid, i + 1, j)  // down
                        + dfs(grid, i - 1, j)  // up
                        + dfs(grid, i, j + 1)  // right
                        + dfs(grid, i, j - 1); // left
        
        return fishCount;
    }
}
