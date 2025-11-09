class Solution {
    public String removeDigit(String number, char digit) {
        int idx = -1;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                idx = i; // possible removal
                // If the next digit is larger, remove this one
                if (i + 1 < number.length() && number.charAt(i + 1) > digit) {
                    break;
                }
            }
        }

        return number.substring(0, idx) + number.substring(idx + 1);
    }
}
