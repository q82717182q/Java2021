package com.yao.leetcode.n237DeleteNodeinaLinkedList;
/*
 * https://www.polarxiong.com/archives/LeetCode-237-delete-node-in-a-linked-list.html
 * 共用時20分
 */
public class Solution {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val=x;}
		
	}
    public void deleteNode(ListNode node) {
    	node.val = node.next.val;
    	node.next = node.next.next;
    }
}

//完全看解答，後面再慢慢了解資料結構吧
