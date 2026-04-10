class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int n = columnNumber;
        while (n>0) {
            n--;
            int rem = n%26;
            char ch = (char) ('A' + rem);
            sb.append(ch);
            n=n/26;
        }
        return sb.reverse().toString();
    }
}
