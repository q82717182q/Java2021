package com.yao.leetcode.IntersectionofTwoLinkedLists;

/*
 * https://www.itread01.com/content/1545872057.html
 * p1 p2分別從A B head開始，當p1走完A，redirect to head of B，當p2走完B, 
 * redirect to head of A，如果它們有intersection，就會相遇
 * !!!因為互相走對方的時候，到相會點時走的前進次數一定相同
 * 要另外用p1 p2是因為原本的headA、headB還要用，切記不能直接用headA、headB
 * 共用時20分鐘
 */


public class Solution {
	class ListNode {
		ListNode next;
		int val;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		ListNode p1 = headA;
		ListNode p2 = headB;
		while (p1 != p2) {
			p1 = (p1 == null) ? headB : p1.next; 
			p2 = (p2 == null) ? headA : p2.next; 
		}
		return p1;
	}
}

/*
 * 如果頭是null直接回傳null
 * 找到相同著另外存起來，直到比對完全部才回傳
 * 如果中間不同則後來又相同則取代
 * 
 */
