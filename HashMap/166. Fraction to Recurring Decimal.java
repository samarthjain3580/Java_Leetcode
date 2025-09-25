class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder ans = new StringBuilder();
        if (numerator > 0 && denominator < 0 || numerator < 0 && denominator > 0) {
            ans.append("-");
        }

        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);

        ans.append(n/d);
        n = n % d;
        if (n == 0) {
            return ans.toString();
        }

        ans.append('.');

        Map <Long,Integer> map = new HashMap<>();
        map.put(n, ans.length());
        
        while (n!=0) {
           n = n*10;
           ans.append(n/d);
           n = n%d;
           if (map.containsKey(n)) {
            int idx = map.get(n);
            ans.insert(idx, "(");
            ans.append(")");
            break;
           }
           else {
            map.put(n, ans.length());
           }
            
        }
        return ans.toString();
    }
}
