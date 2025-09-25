/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length-1;
        return BST(nums, 0, n);
    }

    public TreeNode BST(int[] nums, int left, int right) {
        if (left > right) return null;
        
        int mid = (left + right) /2; // left middle;
        // int mid = (left + right + 1) /2 // right middle;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = BST(nums, left, mid-1);
        root.right = BST(nums, mid+1, right);

        return root;
    }
}
