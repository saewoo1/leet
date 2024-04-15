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
    public int sum(TreeNode root, String value) {
		if (root == null) {
			return 0;
		}
        value += root.val;
		// String 취급 -> 해당 값을 뒤에 이어붙인 뒤 int 변환 후 반환
		if (root.left == null && root.right == null) {
			return Integer.parseInt(value);
		}
		return sum(root.left, value) + sum(root.right, value);

	}

	public int sumNumbers(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return sum(root, "");
	}
}