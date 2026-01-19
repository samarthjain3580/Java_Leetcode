class Solution {
    public String makeGood(String s) {
        Stack <Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty()) {
                char top = stack.peek();
                if (ch-top == 32 || top-ch == 32) stack.pop();
                else stack.push(ch);
            }
            else stack.push(ch);
        }  
        
        StringBuilder sb = new StringBuilder();
        for(char c : stack) sb.append(c);

        return sb.toString();

    }
}
