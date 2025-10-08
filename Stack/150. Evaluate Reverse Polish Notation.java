class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int eval = 0;
        for(int i=0; i<tokens.length; i++) {
            if (tokens[i].equals("+")) {
                stack.push(Integer.valueOf(stack.pop()+stack.pop()));
            }
            else if (tokens[i].equals("*")) {
                stack.push(Integer.valueOf(stack.pop()*stack.pop()));
            }
            else if (tokens[i].equals("-")) {
                int top = stack.pop();
                stack.push(Integer.valueOf(stack.pop()-top));
            }
            else if (tokens[i].equals("/")) {
                int top = stack.pop();
                stack.push(Integer.valueOf(stack.pop()/top));
            }
            else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        System.out.println(stack.peek());
        return stack.peek();
    }
}
