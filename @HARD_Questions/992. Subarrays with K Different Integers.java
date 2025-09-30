// SLIDING WINDOW

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return count_k(nums, k) - count_k(nums, k-1);
    }
    public int count_k(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int i=0, j=0, c=0;
        while(j<nums.length) {
            map.put(nums[j], map.getOrDefault(nums[j],0)+1);
            while(map.size() > k) {
                map.put(nums[i], map.get(nums[i])-1);
                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
                i++;
            }
            j++;
            c+=j-i+1;
        }
        return c;
    }
}
