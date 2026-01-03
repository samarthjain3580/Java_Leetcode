class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=lowLimit; i<=highLimit; i++) {
            int temp = i, sum = 0;
            while(temp>0) {
                int rem = temp%10;
                sum+=rem;
                temp=temp/10;
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return Collections.max(map.values());   
    }
}
