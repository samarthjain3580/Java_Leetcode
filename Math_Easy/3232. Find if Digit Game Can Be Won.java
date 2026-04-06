class Solution {
    public boolean canAliceWin(int[] nums) {
        int digit1 = 0, digit2 = 0;
        for(int num: nums) {
            if (num > 9) digit2+=num;
            else digit1+=num;
        }
        return (digit1 == digit2) ? false : true;
    }
}
