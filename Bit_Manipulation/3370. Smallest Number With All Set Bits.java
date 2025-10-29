class Solution {
    public int smallestNumber(int n) {
        int l = 0;
        while(n>0) {
            n=n/2;
            l++;
        } 

        int ans = (int) Math.pow(2,l);

        return ans-1;
    }
}
