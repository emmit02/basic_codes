Given the root of a binary tree, return the preorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [1,2,3]


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
class Solution {
    public static void tree(TreeNode root, List<Integer> lew){
        if(root==null) return;
        lew.add(root.val);
        tree(root.left,lew);
        tree(root.right,lew);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>lew=new ArrayList<>();
        tree(root,lew);
        return lew;
    }
}