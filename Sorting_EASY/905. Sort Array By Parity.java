class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length-1;
        int[] arr = new int[n+1];
        int idx = 0;
        for(int num: nums) {
            if (num % 2 == 0) arr[idx++] = num;
            else arr[n--] = num;
        }

        return arr;

    }
}
