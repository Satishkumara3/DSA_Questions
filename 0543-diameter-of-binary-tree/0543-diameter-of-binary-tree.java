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
    static int ans;
    public static int level(TreeNode root){
        if(root==null){
            return 0;
        }

        int l=level(root.left);
        int r=level(root.right);

        ans=Math.max(ans,l+r);

        return 1+Math.max(l,r);




    }
    public int diameterOfBinaryTree(TreeNode root) {
        ans=0;
        level(root);
        return ans;

    }
}