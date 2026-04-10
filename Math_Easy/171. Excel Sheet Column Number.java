class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length()-1;

        int sum = 0;
        for(char ch: columnTitle.toCharArray()) {
            int val = ch-'A'+1;
            sum+=(val * Math.pow(26,n));
            n--;
        }
        return sum;
    }
}
