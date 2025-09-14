class Solution {
    public int[] evenOddBit(int n) {
        List<Integer> list = new ArrayList<>();
        while(n>0) {
            int rem = n%2;
            list.add(rem);
            n/=2;
        }

        int even = 0, odd = 0;

        for(int i=0; i<list.size(); i++) {
            if (list.get(i) == 1) {
                if (i%2 == 0) even++;
                else odd++;
            }
        }

        int[] arr = {even, odd};
        return arr;
    }
}
