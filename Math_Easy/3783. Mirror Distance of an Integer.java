class Solution {
    public int mirrorDistance(int n) {
        int rev = reverse(n);
        return Math.abs(n-rev);
    }

    public static int reverse(int n) {
        int temp = n;
        int c = -1;
        while (temp>0) {
            c++;
            temp/=10;
        }

        int ans = 0;
        while (c != -1) {
            int rem = n%10;
            ans = ans + (int) (rem*Math.pow(10,c));
            n=n/10;
            c--;
        }

        return ans;
    }
}
