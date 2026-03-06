class Solution {
    public int minOperations(String s) {

        // 0101010101010-> 7
        // 1010101010101-> 6

        int l = s.length();
        int error = 0;
        for (int i=0; i<l; i+=2) {
            if (s.charAt(i) == '1') error++;
        }

        for (int i=1; i<l; i+=2) {
            if (s.charAt(i) == '0') error++;
        }

        return Math.min(error, l-error);

    }
}
