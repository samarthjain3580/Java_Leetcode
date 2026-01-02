//Only Maths Approach
class Solution {
    public int reverse(int x) {
        int len = String.valueOf(x).length();
        if (x<0) len--;
        int ans = 0;
        while(x>0 || x<0) {
            int rem = x%10;
            ans += rem * Math.pow(10, len-1);
            x=x/10;
            len--;
        }
        if (ans == Integer.MAX_VALUE || ans == Integer.MIN_VALUE) return 0;
        return ans;
    }
}

// Using Arraylist
class Solution {
    public int reverse(int x) {
        List<Integer> list = new ArrayList<>();
        while(x!=0) {
            int rem = x%10;
            list.add(rem);
            x/=10;
        }  
        int l = list.size();
        int sum = 0;
        for(int i=0; i<l; i++) {
            sum += list.get(i) * Math.pow(10, l-1-i);
        }
        if (sum<=Math.pow(-2,31) || sum>= Math.pow(2,31)-1) return 0;
        return sum;
    }
}
