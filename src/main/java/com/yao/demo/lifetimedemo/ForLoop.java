package com.yao.demo.lifetimedemo;

import java.util.ArrayList;
import java.util.List;

import com.yao.demo.listnodedemo.ListNode;

public class ForLoop {
	public static void main(String[] args) {
		List<ListNode> listNodes = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			ListNode listnode1 = new ListNode(i);
			listNodes.add(listnode1);
		}
//		System.out.println(listnode1);//出了for迴圈不能呼叫了
		System.out.println("------------------result");
		//雖然listnode1出了for迴圈就過了生命週期了，但是已經加到list的不會消失
		ListNode listnode1 = getListNode();

	}

	private static ListNode getListNode() {
		// TODO Auto-generated method stub
		return new ListNode(123);
	}
}
