94. Binary Tree Inorder Traversal
Solved

Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example 1:


Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:

Input: root = []
Output: []



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
class inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        List<Integer> list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        return inorderTraversal(root, list);
    }

    private List<Integer> inorderTraversal(TreeNode root, List<Integer>list)
    {
        if(root!=null)
        {
            inorderTraversal(root.left, list);
            list.add(root.val);
            inorderTraversal(root.right, list);
        }
        return list;
    }
}