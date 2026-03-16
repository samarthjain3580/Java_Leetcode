class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int max = 0;

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int area = maxIsland(grid, i, j, visited);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }

    public int maxIsland(int[][]grid, int i, int j, boolean[][] visited){
        if (i<0 || i>=grid.length || j<0 || j>=grid[0].length || visited[i][j] || grid[i][j] ==0) {
            return 0;
        }
        visited[i][j] = true;

        return 1 + maxIsland(grid, i+1, j, visited) + maxIsland(grid, i-1, j, visited) + maxIsland(grid, i, j+1, visited) + maxIsland(grid, i,j-1, visited);
    }
}
