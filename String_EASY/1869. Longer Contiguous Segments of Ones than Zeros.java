class Solution {
    public boolean checkZeroOnes(String s) {
        int one = 0, zero = 0, max_o = 0, max_z = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                one++;
                zero = 0;
                max_o = Math.max(max_o, one);
            } else {
                zero++;
                one = 0;
                max_z = Math.max(max_z, zero);
            }
        }

        return max_o > max_z;
    }
}
