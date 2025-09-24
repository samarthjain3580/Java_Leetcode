// Brute Force Approach
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int[] arr = new int[2];
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                boolean ans = true;
                if (i>0 && mat[i][j] <= mat[i-1][j]) ans = false; 
                if (i<mat.length-1 && mat[i][j] <= mat[i+1][j]) ans = false;
                if (j<mat[0].length-1 && mat[i][j] <= mat[i][j+1]) ans = false;
                if (j>0 && mat[i][j] <= mat[i][j-1]) ans = false;

                if (ans == true) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }
}
