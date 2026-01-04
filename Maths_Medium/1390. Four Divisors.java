class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;

        for (int i : nums) {

            // i = p^3
            int root = (int) Math.round(Math.cbrt(i));
            if (root * root * root == i && isPrime(root)) {
                ans += (1 + root + root * root + i);
                continue;
            }

            // i = p * q
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    int var = i / j;
                    if (j != var && isPrime(j) && isPrime(var)) {
                        ans += (1 + j + var + i);
                    }
                    break; // only break inner loop
                }
            }
        }
        return ans;
    }

    public boolean isPrime(int a) {
        if (a <= 1) return false;
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
