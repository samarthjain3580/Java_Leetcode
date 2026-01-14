// CodeStory with MIK
class Solution {
    public int[] singleNumber(int[] nums) {

        // xor of all elements
        int xor = 0;
        for(int i:nums) {
            xor^=i;
        }

        // create mask to find out the rightmostBit using xor & (2's Complement xor)
        int mask = xor & (-xor);

        // iterate AND Operation through (nums[i] & mask) and separate in 2 groups 
        // if rightmost bit == 1 (group a)
        // if rigthmost bit == 0 (group b)

        int group_a = 0, group_b = 0;

        for(int num : nums) {
            if ((num & mask) != 0) group_a ^= num;
            else group_b ^= num;
        }

        return new int[] {group_a, group_b};
        
    }
}
