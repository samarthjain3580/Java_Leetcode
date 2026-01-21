class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor1 = Bitwise_XOR(arr1);
        int xor2 = Bitwise_XOR(arr2);

        return xor1&xor2;
    }

    public int Bitwise_XOR(int[] nums) {
        int xor = 0;
        for(int i:nums) xor^=i;
        return xor;
    }
}
