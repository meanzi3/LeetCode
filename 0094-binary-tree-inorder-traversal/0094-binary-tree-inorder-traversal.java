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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        inorder(root, answer);
        return answer;
    }

    private void inorder(TreeNode node, List<Integer> answer){
        if (node != null){
            if(node.left != null) {inorder(node.left, answer);}
            answer.add(node.val);
            if(node.right != null) {inorder(node.right, answer);}
        } 
    }

}