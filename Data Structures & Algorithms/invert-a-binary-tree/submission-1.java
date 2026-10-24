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
    public TreeNode invertTree(TreeNode root) {
        
        switchNodes(root);
        return root;

    }

    public void switchNodes(TreeNode node){
        if(node == null){
            return;
        }
        else {            
            TreeNode inter = node.left;
            node.left = node.right;
            node.right=inter;
        }

        switchNodes(node.left);
        switchNodes(node.right);
    }
}
