class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        Stack<Integer> stack =  new Stack<>();
        for(String s:operations) {
            if(s.equals("C")) {
                if(!stack.isEmpty()) stack.pop();
            }
            else if (s.equals("D")) {
                if(!stack.isEmpty()) stack.push(stack.peek()*2);
            }
            else if (s.equals("+")) {
                if (stack.size()>=2) {
                    int first = stack.pop();
                    int second = first + stack.peek();
                    stack.push(first);
                    stack.push(second);
                }
            }
            else {
                stack.push(Integer.parseInt(s));
            }
        }
        // System.out.println(stack);

        int sum = 0;
        while(!stack.isEmpty()) {
            for(int i=0; i<stack.size(); i++) {
                sum += stack.pop();
            }
        }
        return sum;
    }
}
