class Solution {
    public int totalMoney(int n) {
        int sum = 0, ans = 28;
        int rem = n%7;
        int full = n/7;

        if (n<=7) {
            for(int i=1; i<=n; i++) {
                sum+=i;
            }
            return sum;
        }
            
        for(int i=0; i<full; i++) {
            sum += ans;
            ans += 7;
        }

        for(int i=0; i<rem; i++) {
            sum += full+i+1;
        }

        return sum;
    }
}
