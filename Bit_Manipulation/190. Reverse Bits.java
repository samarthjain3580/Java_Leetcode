class Solution {
    public int reverseBits(int n) {
        List<Integer> list = new ArrayList<>();
        while(n!=0) {
            int rem = n%2;
            list.add(rem);
            n/=2;
        }
        
        int l = list.size();
        int sum = 0;
        for(int i=0; i<l; i++) {
            sum += list.get(i) * Math.pow(2,31-i);
        }
        return sum;
    }
}
