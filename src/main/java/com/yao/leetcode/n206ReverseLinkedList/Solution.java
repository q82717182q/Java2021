package com.yao.leetcode.n206ReverseLinkedList;
/*
 * 利用頭插法
 * https://www.polarxiong.com/archives/LeetCode-206-reverse-linked-list.html
 * 共用時30分
 */

public class Solution {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val = x;}
	}
    public ListNode reverseList(ListNode head) {
    	if (head == null|| head.next == null) {
			return head;
		}
    	
    	ListNode newhead = head;
    	
    	while (head.next !=null) {
    		ListNode current = head.next;
    		head.next = head.next.next;
    		current.next = newhead;
    		newhead = current;
		}
        return newhead;
    }
}
/*
 * 
 * 完全不會請看答案
 * */
