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
        TreeNode cur = root;
        
        while (cur != null) { 
            if (cur.left != null) { // 왼쪽 노드가 있으면
                TreeNode pre = cur.left;
                while ((pre.right != null) && (pre.right != cur)){
                    pre = pre.right;
                }
                if(pre.right == null){
                    pre.right = cur;
                    cur = cur.left;
                } else {
                    pre.right = null;
                    answer.add(cur.val);
                    cur = cur.right;
                }
            } else { // 왼쪽 노드가 없으면
                // 현재 값 넣고
                answer.add(cur.val);
                // 오른쪽으로
                cur = cur.right;
            }
        }
        return answer;
    }
}