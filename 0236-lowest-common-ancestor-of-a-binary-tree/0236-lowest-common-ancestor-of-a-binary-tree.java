/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static boolean exist(TreeNode root,TreeNode k){
        if(root==null) return false;

        if(root==k) return true;

        return exist(root.left,k) || exist(root.right,k);

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         if(p==root || q==root) return root;

        boolean PexistLST=exist(root.left,p);
        boolean QexistLST=exist(root.left,q);

        if(PexistLST==true && QexistLST==true){
             return lowestCommonAncestor(root.left,p,q);
        }
        if(PexistLST==false && QexistLST==false){
            return lowestCommonAncestor(root.right,p,q);
        }
        else{
            return root;
    
        }
        
    }
}