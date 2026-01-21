public int xorAllNums(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if (m%2 == 0 && n%2 == 0) return 0;

        int xor1 = Bitwise_XOR(nums1);
        int xor2 = Bitwise_XOR(nums2);

        if (m%2!=0 && n%2!=0) return xor1^xor2;
        else if (m%2!=0 && n%2==0) return xor2;
        else return xor1;
    }

    public int Bitwise_XOR(int[] nums) {
        int xor = 0;
        for(int i:nums) {
            xor^=i;
        }
        return xor;
    }
