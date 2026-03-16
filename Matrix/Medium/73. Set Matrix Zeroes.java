class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if (matrix[i][j] == 0) {
                    a.add(i);
                    b.add(j);
                }
            }
        }

        int la = a.size();
        int lb = b.size();

        // for rows
        while (la > 0) {
            for(int i=0; i<m; i++) {
                matrix[a.get(la-1)][i] = 0;
            }
            la--;
        }
        
        // for columns
        while (lb > 0) {
            for(int i=0; i<n; i++) {
                matrix[i][b.get(lb-1)] = 0;
            }
            lb--;
        }
    }
}
