// https://leetcode.com/problems/increasing-order-search-tree/
// 897. Increasing Order Search Tree/**
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
     TreeNode prev=null, head=null;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null) return null;   
        increasingBST(root.left);  
        if(prev!=null) { 
        	root.left=null; // we no  longer needs the left  side of the node, so set it to null
        	prev.right=root; 
        }
        if(head==null) head=root; // record the most left node as it will be our root
        prev=root; //keep track of the prev node
        increasingBST(root.right); 
        return head;
    }
}
