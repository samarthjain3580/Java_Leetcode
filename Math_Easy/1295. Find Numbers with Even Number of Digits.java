class Solution {
    public int findNumbers(int[] nums) {
        String[] str = new String[nums.length];
        int count = 0;

        for(int i=0; i<nums.length; i++) {
            str[i] = String.valueOf(nums[i]);

            int size = str[i].length();
            if(size % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
