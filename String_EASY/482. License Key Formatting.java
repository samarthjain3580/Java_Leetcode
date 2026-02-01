class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) sb.append(Character.toUpperCase(ch));
            else if (ch != '-') sb.append(ch);
        }

        int grp = 0, idx = 0;
        if (sb.length() % k == 0) {
            grp = sb.length()/k;
            idx = k;
        }
        else {
            grp = (sb.length()/k) + 1;
            idx = sb.length()%k;
        }

        int dash = grp-1;
        while (dash > 0) {
            sb.insert(idx, "-");
            dash--;
            idx+=k+1;
        }

        return sb.toString();
    }
}
