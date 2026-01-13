class Solution {
    public int largestPrime(int n) {
        int sum = 0, max = 0;
        for(int i=2; i<=n; i++) {
            if (isPrime(i)) {
                sum+=i;
                if (sum > n) break;

                if(isPrime(sum)) max = sum;
            }
        }
        return max;
    }

    public boolean isPrime(int n) {
        for(int i=2; i*i<=n; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
}
