class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0, min = Integer.MAX_VALUE;
        int odd = 0;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                long val = matrix[i][j];
                if (val < 0) {
                    odd++;
                    sum-=val;
                    min = Math.min(min, -val);
                }
                else {
                    sum+=val;
                    min = Math.min(min, val);
                }
            }
        }
        if (odd%2 == 0) return sum;
        else return sum-(2*min); 
    }
}
