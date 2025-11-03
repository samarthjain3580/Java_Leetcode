class Solution {
    public int calculate(String s) {
        int n = 0, sign = '+';
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) n = n*10+(ch-'0');

            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length()-1) {
                if (sign == '+') stack.push((int) n );
                else if (sign == '-') stack.push((int) -n);
                else if (sign == '*') stack.push(stack.pop() * (int)n);
                else if (sign == '/') stack.push(stack.pop() / (int)n);

                sign = ch;
                n=0;
            }
        }

        int ans = 0;
        while (!stack.isEmpty()) {
            ans+=stack.pop();
        }
        return ans;
    }
}
