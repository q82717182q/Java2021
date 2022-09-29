package com.yao.leetcode.n155MinStack;

import java.util.Stack;
/*
 * 看不太懂什麼意思
 * 這些用法感覺就是stack本身了幹嘛另外設計
 * 
 */
public class MinStack {
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> minstack = new Stack<Integer>();
		
	    /** initialize your data structure here. */
	    public MinStack() {
	        
	    }
	    
	    public void push(int val) {
	        if (minstack.isEmpty()|| val <= minstack.peek()) {
				minstack.push(val);
			}
	        stack.push(val);
	    }
	    
	    public void pop() {
	        if (stack.peek().equals(minstack.peek())) {
				minstack.pop();
			}
	        stack.pop();
	    }
	    
	    public int top() {
	        return stack.peek();
	    }
	    
	    public int getMin() {
	        return minstack.peek();
	    }
}
//	    public static void main(String[] args) {
//	    	int val = 0;
//	    	MinStack obj = new MinStack();
//	    	 obj.push(val);
//	    	 obj.pop();
//	    	 int param_3 = obj.top();
//	    	 int param_4 = obj.getMin();
//		}

