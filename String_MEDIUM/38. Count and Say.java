class Solution {
    public String countAndSay(int n) {
        String ans = "1";
        ans = RLE(n, ans);
        return ans;
    }

    public String RLE(int n, String s) {
        if (n==1) return s;
        int l = s.length();
        StringBuilder sb = new StringBuilder();
        int c = 1;
        for(int i=1; i<l; i++) {
            if (s.charAt(i) == s.charAt(i-1)) c++;
            else {
                sb.append(c);
                sb.append(s.charAt(i-1));
                c=1;
            }
        }

        sb.append(c);
        sb.append(s.charAt(l-1));

        return RLE(n-1, sb.toString());

    }
}
