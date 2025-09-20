class Solution {
    public int smallestNumber(int n, int t) {
        int div = n;
        int pro = 1;
        while(div>0) {
            int rem = div%10;
            pro *= rem;
            div = div/10;
        }

        if(pro % t != 0) {
            return smallestNumber(n+1, t);
        }
        return n;

    }
}
