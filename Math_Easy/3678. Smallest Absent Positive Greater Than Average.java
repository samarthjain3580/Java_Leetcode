class Solution {
    public int smallestAbsent(int[] nums) {
        int n = nums.length;
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            sum+=nums[i];
        }
        
        double avg = (double) sum/n;

        List<Integer> list = new ArrayList<>();
        for(int i: nums) {
            list.add(i);
        }

        int ans = (int) Math.floor(avg) + 1;
        
        while(true) {
            if(ans > 0 && !list.contains(ans)) {
                return ans;
            }
            ans++;
        }
    }
}
