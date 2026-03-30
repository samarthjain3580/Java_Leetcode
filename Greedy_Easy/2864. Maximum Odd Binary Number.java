class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        int one = 0, zero = 0;
        for(char ch: s.toCharArray()) {
            if (ch=='0') zero++;
            else one++;
        }

        while (one-->1) sb.append(1);
        while (zero-->0) sb.append(0);

        sb.append(1);

        return sb.toString();
    }
}
