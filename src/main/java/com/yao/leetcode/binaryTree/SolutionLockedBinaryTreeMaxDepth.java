package com.yao.leetcode.binaryTree;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 

public class SolutionLockedBinaryTreeMaxDepth {
	int numberOfRoot = 0;
	int maxDepth = 0;
	public SolutionLockedBinaryTreeMaxDepth(TreeNode root) {
//		Integer[] r = new Integer[root];
//		for (TreeNode integer : root) {
//    		if (integer == null) {
//				continue;
//			}
//    		numberOfRoot++;
//			System.out.print(" "+integer +" ");
//		}
	}
	
	
}
/*當作root是Integer陣列，用foreach先讀取root裡面扣掉null之後有幾個數字
 *用左邊界2^(k-1)+1右邊界2^(k+1)-1確定k，k即為完全二元樹的層數
 *但是題目的層數感覺比定義多一所以maxdepth為k+1
 * 
 * */
