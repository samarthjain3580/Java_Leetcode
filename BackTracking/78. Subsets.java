class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        backtracking(0, nums, subset, list);
        return list;
    }

    public void backtracking(int start, int[] nums, List<Integer> subset, List<List<Integer>> list) {
        list.add(new ArrayList<>(subset));
        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            backtracking(i + 1, nums, subset, list);
            subset.remove(subset.size() - 1);
        }
    }
}
