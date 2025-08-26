class Solution {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        int i=0;
        List<Integer> digs = new ArrayList<>();
        int carry=0;
        while (i<l1 && i<l2) {
            int c1 = num1.charAt(l1-1-i) - '0';
            int c2 = num2.charAt(l2-1-i) - '0';
            int sum = c1+c2+carry;
            carry = sum/10;
            sum = sum%10;
            digs.add(sum);
            i++;
        }
        while (i<l1) {
            int c1 = num1.charAt(l1-1-i) - '0';
            int sum = c1+carry;
            carry=sum/10;
            sum = sum%10;
            digs.add(sum);
            i++;
        }
        while (i<l2) {
            int c2 = num2.charAt(l2-1-i) - '0';
            int sum = c2+carry;
            carry=sum/10;
            sum = sum%10;
            digs.add(sum);
            i++;
        }
        if (carry>0) digs.add(carry);
        StringBuilder sb = new StringBuilder();
        for (int di = digs.size()-1; di>=0; di--) {
            char c = (char)(digs.get(di) + (int)'0');
            sb.append(c);
        }
        return sb.toString();
    }
}
