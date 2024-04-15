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
import java.util.*;
class Solution {
    public int sumNumbers(TreeNode root) {
       int sum=0;
       Queue<TreeNode>q=new LinkedList();
       q.offer(root);
       while(!q.isEmpty()){
           TreeNode node=q.poll();
           if(node.right==null && node.left==null){
               sum+=node.val;
           }
            if(node.left!=null){
                node.left.val+=node.val*10;
                q.offer(node.left);
            }
            if(node.right!=null){
                node.right.val+=node.val*10;
                q.offer(node.right);
            }
       }
       return sum; 
    }
}