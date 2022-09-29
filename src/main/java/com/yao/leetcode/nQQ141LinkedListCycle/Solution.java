package com.yao.leetcode.nQQ141LinkedListCycle;
/*
 * 通過考慮不同速度的兩個指標 - 慢速指標和快速指標，可以將空間複雜度降低到O（1）O（1）。
 *      慢速指標一次移動一步，而快速指標一次移動兩步。
 *      如果連結串列中沒有迴圈，則快速指標最終將到達結尾，在這種情況下我們可以返回false。
 
 * QQ完全不會list，為啥.next就是下一個
 * while裡面fast
 * 不是fast = head.next.next
 * slow亦同
 * while裡面的if要放前面，放在fast跟slow後面會報錯
 * QQ為什麼呢！！？
 * 
 */
public class Solution {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
	}
    public boolean hasCycle(ListNode head) {
    	if (head == null || head.next == null) {
			return false;
		}
    	ListNode fast = head.next;
    	ListNode slow = head;
    	
    	while (slow != fast) {
    		if (fast == null || fast.next == null) {
    			return false;
    		}
			fast = fast.next.next;
			slow = slow.next;
		}
    	
    	return true;
    }
}
