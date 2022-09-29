package com.yao.leetcode.n101SymmetricTree;
/*
 * 
 * 共用時35分
 * 
 * 
 * */
public class Solution {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val){this.val=val;}
		TreeNode(int val,TreeNode left,TreeNode right){
			this.val=val;
			this.left=left;
			this.right=right;
			}
	}
	
    public boolean isSymmetric(TreeNode root) {
    	
    	return isMirror(root,root);
    }
    public boolean isMirror(TreeNode left,TreeNode right) {
    	if (left == null && right == null) {
			return true;
		}
    	if (left == null || right == null) {
			return false;
		}
    	return (left.val == right.val) && isMirror(left.left,right.right)
    			&& isMirror(left.right,right.left);
    }
}

/*
 * 除了第一個root 1之外用xor去判斷是否為偶數個？不行這樣不對稱也能成立
 * 找到中間然後往左往右看，跟之前學(n108)的一樣
 * 
 * */
 