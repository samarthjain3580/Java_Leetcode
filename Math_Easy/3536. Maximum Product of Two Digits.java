class Solution {
    public int maxProduct(int n) {
        int[] freq = new int[10];
        while (n>0) {
            int rem = n%10;
            freq[rem]++;
            n=n/10;
        }
        
        int digit1 = 0, digit2 = 0;
        int max = 0;
        for(int i=0; i<10; i++) {
            if (freq[i] >= 1) {
                digit2 = digit1;
                digit1 = i;
            }
        } 
        max = digit1*digit2;

        for(int i=0; i<10; i++) {
            if (freq[i] > 1) {
                max = Math.max(max, i*i);
            }
        }
        return max;
    }
}
