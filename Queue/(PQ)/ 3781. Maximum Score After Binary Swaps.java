class Solution {
    public long maximumScore(int[] nums, String s) {
        long res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<nums.length; i++) {
            pq.offer(nums[i]);
            
            if (s.charAt(i) == '1') {
                int top = pq.poll();
                res+=top;
            }
        }

        return res;

    }
}
