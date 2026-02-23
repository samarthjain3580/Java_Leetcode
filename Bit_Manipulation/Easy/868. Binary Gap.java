class Solution {
    public int binaryGap(int n) {
        boolean flag = false;
        int count = 0, max = 0;
        while (n>0) {
            if (n%2 == 1) {
                if (flag) {
                    max = Math.max(max,count);
                    count = 0;
                }
                flag = true;
                count++;

            } 
            else {
                if (flag) count++;
            }
            n=n/2;
        }
        return max;
    }
}
