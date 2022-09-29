package com.yao.leetcode.nQQ104MaximumDepthofBinaryTree;
/*
 * https://woooooooooord.wordpress.com/2016/11/29/leetcode-104-maximum-depth-of-binary-treejava/
 * 輸入null當然return 0
 * QQ但是為什麼是只討論左右的最大深度而已
 * 最大深度不會長在中間？？
 * 共用時15分鐘
 */
public class Solution {
	
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(){}
		TreeNode(int val){this.val = val;}
		TreeNode(int val,TreeNode left,TreeNode right){
			this.val = val;
			this.left = left;
			this.right = right;
			}
	}
	
    public int maxDepth(TreeNode root) {
    	if (root == null) {
			return 0;
		}
    	int result = 0;
    	result = 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    	return result ;
    }
}

/*
 * 對二元樹沒概念
 * 
 */