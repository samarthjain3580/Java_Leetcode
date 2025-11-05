class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i: asteroids) {
            if (stack.isEmpty()) {
                stack.push(i);
            }
            else {
                if (i > 0) {
                    stack.push(i);
                }
                else {
                    boolean flag = true;
                    while (!stack.isEmpty() && stack.peek() > 0) {
                        if (Math.abs(i) > stack.peek()) {
                            stack.pop();
                        }
                        else if (Math.abs(i) == stack.peek()) {
                            stack.pop();
                            flag = false;
                            break;
                        }
                        else {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) stack.push(i);
                }
            }
        }

        int[] ans = new int[stack.size()];

        for(int i=stack.size()-1; i>=0; i--) {
            ans[i] = stack.pop(); 
        }
        
        return ans;
    }
}
