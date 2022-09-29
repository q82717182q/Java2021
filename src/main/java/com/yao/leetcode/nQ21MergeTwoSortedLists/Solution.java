package com.yao.leetcode.nQ21MergeTwoSortedLists;
/*
 * QQ為什麼最後return是result.next明明運算過程完全沒出現result
 * QQ為什麼不能直接回傳cur
 * QQ為什麼要另外弄一個cur
 * QQ為什麼網路上答案判斷完第一個while之後都只用if
 * 但是這兩個if沒有用到while也對
 * 因該是本來就鏈結起來的所以不用while一個一個去等於所以直接if就好
 * 共用時57分
 * */


public class Solution {

	class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) {this.val = val;}
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode result = new ListNode(0);
		ListNode cur = result;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				cur.next = l1;
				l1 = l1.next;
			} else {
				cur.next = l2;
				l2 = l2.next;
			}
			cur = cur.next;
		}
		while (l1 != null) {
			cur.next = l1;
			l1 = l1.next;
			cur = cur.next;
		}
		while (l2 != null) {
			cur.next = l2;
			l2 = l2.next;
			cur = cur.next;
		}
		
		return result.next;
}
}

/*
 * 
 * 以l1為底 l2大於l2就把l1.next往後推並用l2取代原本的l1.next 或是另外創一個以其中一個為底依序比較放入
 * 原本以為只是arraylist直接加再一起在用sort 但是這樣用list就不會了
 * 
 */
