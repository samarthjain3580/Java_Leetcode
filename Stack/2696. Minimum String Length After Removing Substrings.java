class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()) {
            if (!stack.isEmpty()) {
                if (ch == 'B' && stack.peek() == 'A') stack.pop();
                else if (ch == 'D' && stack.peek() == 'C') stack.pop();
                else stack.push(ch);
            } 
            else stack.push(ch);
        }
        return stack.size();
    }
}
