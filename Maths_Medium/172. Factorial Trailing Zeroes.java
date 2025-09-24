class Solution {
    public int trailingZeroes(int n) {
        int c = 0;
        while (n>0) {
            int div = n/5;
            c+=div;
            n = n/5;
        }
        return c;
    }
}
