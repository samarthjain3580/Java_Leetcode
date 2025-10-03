class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> com = new ArrayList<>();
        backtracking(nums, 0, com, ans, target); 
        return ans;
    }

    public void backtracking(int[] nums, int idx, List<Integer> com, List<List<Integer>> ans, int target) {
        if (idx==nums.length || target < 0) {
            return;
        }

        if (target == 0) {
            // if (!ans.contains(com)) {
                ans.add(new ArrayList<>(com));
                return;
            // }
        }

        com.add(nums[idx]);
        // backtracking(nums, idx+1, com, ans, target-nums[idx]); // single inclusion
        backtracking(nums, idx, com, ans, target-nums[idx]); // multi inclusion

        com.remove(com.size()-1);
        backtracking(nums, idx+1, com, ans, target); // exclusion

    }
}
