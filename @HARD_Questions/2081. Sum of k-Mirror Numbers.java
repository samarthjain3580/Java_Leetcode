class Solution {
    public long kMirror(int k, int n) {
        int l = 1;
        long sum = 0;
        while (n > 0) {
            int half = (l + 1) / 2;
            int min = (int) Math.pow(10, half - 1);
            int max = (int) Math.pow(10, half) - 1;
            if (half == 1) min = 1;

            for (int i = min; i <= max && n > 0; i++) {
                String x = String.valueOf(i);
                String pal = "";
                if (l % 2 == 0) {
                    pal = x + reverse(x);
                } else {
                    pal = x + reverse(x).substring(1);
                }

                long val = Long.parseLong(pal);
                String base = baseK(val, k);
                if (isPalindrome(base)) {
                    sum += val;
                    n--;
                }
            }
            l++;
        }
        return sum;
    }

    public String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public String baseK(long n, int k) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int r = (int) (n % k);
            sb.append(r);
            n = n / k;
        }
        return sb.toString();
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
