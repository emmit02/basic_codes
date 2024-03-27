110. Balanced Binary Tree
Solved
Easy
Topics
Companies
Given a binary tree, determine if it is 
height-balanced
.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: true



//solution



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
class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) 
    {
        if (root == null)
        {
            return true;
        }             
        return height(root)!=-1;
    }
    
    public int height(TreeNode node)
    {
        if (node==null)
        {
            return 0;       
        }
        int left = height(node.left);
            int right = height(node.right);
            int system=Math.abs(left-right);
            if(system > 1 || left == -1 || right ==-1 )
            {
                return -1;
            }
            return 1 + Math.max(left,right);
    }
}