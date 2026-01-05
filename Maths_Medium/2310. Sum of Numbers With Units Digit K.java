class Solution {
    public int minimumNumbers(int num, int k) {
        if (num == 0) return 0;
        if (num<k || (num<10 && k==0)) return -1;
        if (k%2 == 0 && num%2 != 0) return -1;
        if (k%5 == 0 && num%5 != 0) return -1;
        
        int unit = num%10, var = 0;
        for(int i=1; i<=10; i++) {
            if (unit == (i*k)%10) {
                var = i;
                break;
            }
        }

        if(k*var > num) return -1;
        return var;
    }
}
