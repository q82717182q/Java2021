package com.yao.leetcode.nQQ234PalindromeLinkedList;
/*

過半之後的reverse直接另外寫
 * head跟head.next也要確定不是null
 * QQ可是head是null的話head.next不是一定也是null嗎？還是有例外情況
 * fast 的while條件要加上&&後面，因為是走兩格，所以也要確定下一格不是null
 * 
 * */
public class Solution {
	class ListNode {
		ListNode next;
		int val;

		ListNode(int x) {
			val = x;
			next = null;

		}

	}

	public boolean isPalindrome(ListNode head) {

		if (head == null || head.next == null) {
			return false;
		}
		ListNode fast = head;
		ListNode slow = head;
		
		while (fast !=null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		if (fast != null) {         //QQ這邊不知道是幹嘛用的
			slow = slow.next;
		}
		slow = reverse(slow);  //QQ這樣看起來只有比一個node啊還是有什麼誤會
		return true;
	}

	ListNode reverse(ListNode head) {
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
 * 題目問回文所以一定是偶數，不用去考慮奇數問題
 * 當fast走到null就代表slow剛好走到一半了
 * 
 * 
 * */
