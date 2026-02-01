class Solution {
    public String maskPII(String s) {
        StringBuilder sb = new StringBuilder();

        if (Character.isLetter(s.charAt(0))) {
            s = s.toLowerCase();
            int idx = s.indexOf('@');
            return s.charAt(0) + "*****" + s.charAt(idx - 1) + s.substring(idx);
        }

        String digits = "";
        for (char ch : s.toCharArray()) if (Character.isDigit(ch)) digits += ch;

        String local = "***-***-" + digits.substring(digits.length() - 4);
        int countryLen = digits.length() - 10;

        if (countryLen == 0) return local;

        return "+" + "*".repeat(countryLen) + "-" + local;
    }
}
