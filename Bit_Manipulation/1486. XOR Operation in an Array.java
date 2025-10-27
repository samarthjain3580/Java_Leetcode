class Solution {
    public int xorOperation(int n, int start) {
        int i = 1;
        int num = start;
        while(n-->1) {
            num = num ^ (start + 2 * i);
            i++;
        }
        return num;
    }
}
