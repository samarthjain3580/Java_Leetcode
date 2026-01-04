class Solution {
    public boolean isThree(int n) {
        if (n<4 || isPrime(n)) return false;

        int m = (int) Math.sqrt(n);
        if (m*m == n && isPrime(m)) return true;
        return false; 

    }

    public boolean isPrime(int x) {
        for(int i=2; i*i<=x; i++) {
            if (x%i == 0) return false;
        }
        return true;
    }
}
