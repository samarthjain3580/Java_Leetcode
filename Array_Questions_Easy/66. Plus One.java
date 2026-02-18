class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 0;
        if (digits[n-1] != 9) {
            digits[n-1]++;
        }
        else {
            for(int i=n-1; i>=0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                    carry++;
                }
                else {
                    digits[i] = digits[i] + 1;
                    break;
                }
            }
        }

        if (carry == n) {
            int arr[] = new int[n+1];
            arr[0] = 1;
            return arr;
        }

        return digits;
    }
}
