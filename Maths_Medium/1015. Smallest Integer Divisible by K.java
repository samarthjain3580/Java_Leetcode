class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2 == 0 || k%5 == 0) return -1;

        int n = 1;
        int count = 1;

        while(n%k != 0){
            n = (n*10 + 1)%k;
            count++;
        }

        return count;

        // BigInteger n = new BigInteger("1");
        // BigInteger m = BigInteger.valueOf(k);
        // int count = 1;
        // while (!n.mod(m).equals(BigInteger.ZERO)) {
        //     n = n.multiply(BigInteger.TEN).add(BigInteger.ONE);

        //     count++;
        // }

        // return count;
    }
}
