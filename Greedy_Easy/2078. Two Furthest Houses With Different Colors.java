class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int left = 0, right = n-1;

        int max = 0;
        while (left != right) {
            if (colors[left] != colors[right]) {
                max = Math.max(max, right-left);
                break;
            }
            right--;
        }
        
        left = 0; 
        right = n-1;
        while (left != right) {
            if (colors[left] != colors[right]) {
                max = Math.max(max, right-left);
                break;
            }
            left++;
        }

        return max;

    }
}
