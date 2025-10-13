class Solution {
    public int getMaximumGold(int[][] grid) {
        int n = grid.length;
        int max = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    max = Math.max(max, CollectGold(grid, i, j));
                }
            }
        }
        return max;
    }

    public int CollectGold(int[][] grid, int i, int j) {
        if (i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == 0) {
            return 0;
        }

        int gold = grid[i][j];
        grid[i][j] = 0;  // marked;

        int up = CollectGold(grid, i-1, j);
        int down = CollectGold(grid, i+1, j);
        int left = CollectGold(grid, i, j-1);
        int right = CollectGold(grid, i, j+1);

        grid[i][j] = gold;

        return gold + Math.max(Math.max(up, down), Math.max(left, right));
    }
}
