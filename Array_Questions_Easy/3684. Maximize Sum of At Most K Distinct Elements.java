class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        int n = nums.length;
        Set <Integer> set = new HashSet<>();
        for(int num: nums) {
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list);
        Collections.reverse(list);
        k = Math.min(k, list.size());

        int[] arr = new int[k];
        for(int i=0; i<k; i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}
