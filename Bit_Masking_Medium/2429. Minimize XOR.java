class Solution {
    public int minimizeXor(int num1, int num2) {
        int ans = num1;
        int req = 0, avail = 0;
        while (num2>0) {
            num2 = (num2 & (num2-1));
            req++;
        }
        
        while (num1>0) {
            num1 = (num1 & (num1-1));
            avail++;
        }

        if (avail == req) return ans;
        else if (avail < req) {
            int diff = req-avail;
            while (diff > 0) {
                ans = (ans | (ans+1));
                diff--;
            }
            return ans;
        }
        else {
            int diff = avail-req;
            while (diff > 0) {
                ans = (ans & (ans-1));
                diff--;
            }
            return ans;
        }
    } 
}
