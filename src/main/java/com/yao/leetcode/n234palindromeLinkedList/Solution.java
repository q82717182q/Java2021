package com.yao.leetcode.n234palindromeLinkedList;
/*
 * 看不懂解法在幹嘛
 * ListNode好像需要了解一下
 */

class ListNode {
	int val;
	ListNode next;
	ListNode() {	}
	ListNode(int val) {	this.val = val;	}
	ListNode(int val, ListNode next) {	
		this.val = val;
		this.next = next;
	}
}

public class Solution {
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		ListNode slow = head;
		ListNode fast = head;
		
		while (fast != null && fast.next != null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		if (fast!=null) {	/*跟上面條件一樣，這行不會永遠執行不到嗎*/
			slow=slow.next;
		}
		slow = reverse(slow);
		while (slow !=null) {
			if (head.val !=slow.val) {
				return false;
			}
			head = head.next;
            slow = slow.next;
		}
		
		return true;
	}

	public ListNode reverse(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;

	}
}

/*
 * 跟之前用的stringbuffer的reverse不同，這邊是這列不適用字串 另外用一個陣列出來for迴圈反向存入
 * 之後與原本陣列逐一比對相同報T，不同報F
 */