class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        arrange(nums, 0, list, ans);
        return ans;
    }

    public void arrange(int[] nums, int idx, List<Integer> list, List<List<Integer>> ans) {

        if (idx == nums.length) {
            list = new ArrayList<>();
            for (int n : nums) list.add(n);
            ans.add(list);
            return;
        }

        for(int i=idx; i<nums.length; i++) {
            swap(nums, idx, i);
            arrange(nums, idx+1, list, ans);
            swap(nums, idx, i);
        }
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
