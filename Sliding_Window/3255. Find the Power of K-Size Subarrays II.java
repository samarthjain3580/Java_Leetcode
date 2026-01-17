class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n-k+1];

        int consec = 1; // length of current consecutive sequence

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1] + 1) {
                consec++;
            } else {
                consec = 1;
            }

            if (i >= k - 1) {
                if (consec >= k) {
                    arr[i - k + 1] = nums[i];
                } else {
                    arr[i - k + 1] = -1;
                }
            }
        }
        // int left = 0, right = k, idx = 0;
        // while (right-1<n) {
        //     boolean flag = false;
        //     for(int i=left; i<right-1; i++) {
        //         if (nums[i]-nums[i+1] != -1) {
        //             flag = true;
        //             break;
        //         }
        //     }
        //     if (!flag) arr[idx] = nums[right-1];
        //     else arr[idx] = -1;
        //     idx++;
        //     right++;
        //     left++;
        // }

        return arr;

    }
}
