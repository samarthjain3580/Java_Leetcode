class Solution {
    public int countTriples(int n) {
        int count = 0;
        int a = 1, b = 2, c = 3;
        for(int i=a; i<n; i++) {
            for(int j=b; j<n; j++) {
                for(int k=c; k<=n; k++) {
                    if (i*i + j*j == k*k) count++;
                }
            }
        }
        return count;
    }
}
