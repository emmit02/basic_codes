102. Binary Tree Level Order Traversal
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]



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
class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> list = new ArrayList<>();
        pre(root, 0 , list);
        return list;
    }

    public static void pre(TreeNode root,int l, List<List<Integer>>list)
    {
        if(root == null)
        {
            return;
        }
        
        if(list.size()==l)
        {
            List<Integer> list2 = new ArrayList<>();
            list2.add(root.val);
            list.add(list2);

        }
        else
        {
            list.get(l).add(root.val);
        }
        pre(root.left, l+1, list);
        pre(root.right, l+1, list);
    }
}