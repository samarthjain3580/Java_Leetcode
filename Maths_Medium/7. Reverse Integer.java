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
