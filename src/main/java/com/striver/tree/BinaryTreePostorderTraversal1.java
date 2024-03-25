145. Binary Tree Postorder Traversal
Solved
Easy
Topics
Companies
Given the root of a binary tree, return the postorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [3,2,1]


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
class BinaryTreePostorderTraversal1
{
    static List<Integer> result;
    private static void traversePostorder(TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        if(node.left != null)
        {
            traversePostorder(node.left);
        }

        if(node.right != null)
        {
            traversePostorder(node.right);
        }
        
        result.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode root)
    {
        result = new ArrayList<>();
        traversePostorder(root);
        return result;
    }
}