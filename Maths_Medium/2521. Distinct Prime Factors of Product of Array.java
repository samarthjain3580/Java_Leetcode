class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums) {
            primeFactors(num, set);
        }
        return set.size();
    }
    public void primeFactors(int num, Set<Integer> set) {
        if (isPrime(num)) set.add(num);

        for(int i=2; i*i<=num; i++) {
            if (num % i == 0) {
                num = num/i;
                primeFactors(num, set);
                primeFactors(i, set);
            }
        }
    } 

    public boolean isPrime(int n) {
        for(int i=2; i*i<=n; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
}
