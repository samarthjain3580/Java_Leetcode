class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int min = Integer.MAX_VALUE;

        for(int i=1; i<n; i++) {
            min = Math.min(min, arr[i]-arr[i-1]);
        }

        List<List<Integer>> ans = new ArrayList<>();
        // List<Integer> list = new ArrayList<>();

        for (int i=1; i<n; i++) {
            int diff = arr[i]-arr[i-1];
            if (diff == min) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                ans.add(list);
            }
        }

        return ans;

    }
}
