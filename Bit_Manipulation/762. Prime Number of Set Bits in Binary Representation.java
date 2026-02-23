class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i=left; i<=right; i++) {
            int set_bits = Integer.bitCount(i);
            // int set_bits = no_of_bits(i); 
            if (isPrime(set_bits)) count++;
        }
        return count;
    }

    // public int no_of_bits(int n) {
    //     int bits = 0;
    //     while (n>0) {
    //         if (n%2 == 1) bits++;
    //         n=n/2;
    //     }
    //     return bits;
    // }

    public boolean isPrime(int num) {
        if (num < 2) return false;
        for(int i=2; i*i<=num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
