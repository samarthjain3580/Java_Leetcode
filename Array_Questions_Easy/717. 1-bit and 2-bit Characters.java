class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        boolean flag = false;
        int i = 0;
        while (n>i) {
            if (bits[i] == 1) {
                i+=2;
                flag = false;
            } 
            else {
                i++;
                flag = true;
            }
        }
        return flag;
    }
}
