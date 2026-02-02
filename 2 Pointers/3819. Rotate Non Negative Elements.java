class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n = nums.length;
        int c = 0;
        for(int num: nums) {
            if (num >= 0) c++;
        }

        int[] arr = new int[c];
        int j = 0; 
        for(int i=0; i<n; i++) {
            if (nums[i] >= 0) {
                arr[j] = nums[i];
                j++;
            } 
        }

        if (c<2) return nums;

        k = k%c;

        int[] temp = new int[c];
        int x = 0;
        for(int i=k; i<c; i++) {
            temp[x] = arr[i];
            x++;
        }

        for(int i=0; i<k; i++) {
            temp[x] = arr[i];
            x++;
        }

        int y=0;
        for(int i=0; i<n; i++) {
            if (nums[i] >= 0) {
                nums[i] = temp[y];
                y++;
            }
        }

        return nums;
    }
}
