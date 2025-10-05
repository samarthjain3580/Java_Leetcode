class Solution {
    public int alternateDigitSum(int n) {
        int l = String.valueOf(n).length();
        int m = n;
        int sum = 0;
        
        if (l%2 == 0) {
            int sign = -1;
            while (n>0) {
                sum+=n%10*sign;
                sign*=-1;
                n=n/10;
            }
        }
        if (l%2 !=0) {
            int sign = 1;
            while (m>0) {
                sum+=m%10*sign;
                sign*=-1;
                m=m/10;
            }
        }
        return sum;
    }
}
