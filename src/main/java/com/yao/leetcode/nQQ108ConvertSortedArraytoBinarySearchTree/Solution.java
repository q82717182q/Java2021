package com.yao.leetcode.nQQ108ConvertSortedArraytoBinarySearchTree;
/*
 * https://desolve.medium.com/%E5%BE%9Eleetcode%E5%AD%B8%E6%BC%94%E7%AE%97%E6%B3%95-35-bst-3-b1f225f39aa3
 * 遇到這種題目一樣，先初始條件為null去掉
 * 有點看不懂啊感覺在背題目
 * 判斷式
 * if (nums == null||nums.length ==0)
 * 右邊不用也可以過，
 * 共用時46分
 */


public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val){this.val = val;}
		TreeNode(int val,TreeNode left,TreeNode right){
			this.val = val;
			this.left = left;
			this.right = right;
			}
	}
	
    public TreeNode sortedArrayToBST(int[] nums) {
    	if (nums == null||nums.length ==0) {
			return null;
		}
    	return getTreeNode(nums,0,nums.length-1);
    }
    public TreeNode getTreeNode(int[] nums,int start,int end) {
    	if (start > end) {
			return null;
		}
    	int mid = start + (end - start)/2;
    	TreeNode root = new TreeNode(nums[mid]);
    	root.left = getTreeNode(nums,start,mid-1);
    	root.right = getTreeNode(nums,mid+1,end);
    	
		return root;
    	
    }
    
}


/*
 * 遇到這種題目一樣
 * 
 * 
 */