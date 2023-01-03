package com.yao.demo.leetcode.medium;

/**
 * @author yaochinho
 *
 * @date 2022年9月30日
 * 關鍵是進位方式，不用特地反過來才開始倒敘，直接把每一個listnode加起來，有進位放在下一個listnode就好
 */
public class P2AddTwoNumbers {
	public static void main(String[] args) {
		
		//第二組輸入  答案 8 -> 9 -> 9 -> 9 -> 0 -> 0 -> 0 -> 1
		ListNode l24 = new ListNode(9);
		ListNode l23 = new ListNode(9,l24);
		ListNode l22 = new ListNode(9,l23);
		ListNode l21 = new ListNode(9,l22);
		ListNode l17 = new ListNode(9);
		ListNode l16 = new ListNode(9,l17);
		ListNode l15 = new ListNode(9,l16);
		ListNode l14 = new ListNode(9,l15);
		ListNode l13 = new ListNode(9,l14);
		ListNode l12 = new ListNode(9,l13);
		ListNode l11 = new ListNode(9,l12);
		
		//第一組輸入  答案 7 -> 0 -> 8
//		ListNode l23 = new ListNode(4);
//		ListNode l22 = new ListNode(6,l23);
//		ListNode l21 = new ListNode(5,l22);
//		ListNode l13 = new ListNode(3);
//		ListNode l12 = new ListNode(4,l13);
//		ListNode l11 = new ListNode(2,l12);
		
//		System.out.println("l11 : " + l11.val);
//		System.out.println("l12 : " + l12.val);
//		System.out.println("l13 : " + l13.val);
//		System.out.println("l21 : " + l21.val);
//		System.out.println("l22 : " + l22.val);
//		System.out.println("l23 : " + l23.val);
//		System.out.println("l11.next.val : " + l11.next.val);
//		System.out.println("l12.next.val : " + l12.next.val);
//		System.out.println("l13.next.val : " + l13.next.val); // null
//		System.out.println("l21.next.val : " + l21.next.val);
//		System.out.println("l22.next.val : " + l22.next.val);
//		System.out.println("l23.next.val : " + l23.next.val); // null
		
		
		new Solution().addTwoNumbers(l11, l21);
	}

}



class Solution {
	
	//DIY
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode a = l1;//這樣移動指針就跟l1沒關係了
		ListNode b = l2;
		ListNode ans = new ListNode();
		ListNode temp = ans;//temp繼承ans的記憶體位置
		
		//要加總、進位、
		while (a != null || b != null || temp.next != null) {//a與b沒有，且沒有下一個temp才停下
			int sum = 0;
			int carry = 0;
			
			sum = temp.val + (a == null ? 0 : a.val) + (b == null ? 0 : b.val) ;
			
			if (sum >= 10) {//加總有要進位就carry +1   sum取個位數
				sum %= 10;
				carry++;
			}
			
			temp.val = sum;
			
			if (a != null) {
				a = a.next;
			}
			if (b != null) {
				b = b.next;
			}
			
			
			if (a != null || b != null || carry == 1) {//carry，要進位的話也還要串新的listNode
				temp.next = new ListNode(carry);//串新的listNode順便把有沒有進位帶到下一個node，放到temp.val
				temp = temp.next;
			}
			
		}
		
        return ans;
    }
	
	
	//answer  https://mrcodingroom.freesite.host/javaleetcode-add-two-numbers/
//	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		 
//        ListNode p = l1; //這樣移動p的指針就跟l1沒關係了
//        ListNode q = l2;
//        ListNode ans = new ListNode(0);
//        ListNode temp = ans; // 這樣宣告，temp則是繼承了ans的記憶體位置 call by address 
// 
//        while (p != null || q != null) {
//            int a = 0, b = 0, sum = 0, carry = 0;
// 
//            if (p == null)
//                a = 0;
//            else
//                a = p.val;
// 
//            if (q == null)
//                b = 0;
//            else
//                b = q.val;
// 
//            sum = temp.val + a + b; // 要加原本已經進位的數值
//            if (sum >= 10) {
//                sum = sum % 10;
//                carry++;
//            }
// 
//            if (p != null)
//                p = p.next;
// 
//            if (q != null)
//                q = q.next;
// 
//            temp.val = sum;
//             
//            if (p != null || q != null || carry >= 1) { //3個條件都不符合就不要在串新的listnode了
//                temp.next = new ListNode(carry);
//                temp = temp.next;
//            }
// 
//        }
//        return ans;
//    }
	
//    //用指針來處理就好，不用new出一堆東西，也不用真的先想辦法把數字反向再加起來再反向
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//    	List<String> num1List = new ArrayList<>();
//    	List<String> num2List = new ArrayList<>();
//    	System.out.println("VVVVVVVVVVaddTwoNumbers----------");
////    	System.out.println(l1.val);
////    	System.out.println(l1.next.val);
////
//    	
//    	while ((Integer)l1.val != null) {
//    		num1List.add(String.valueOf(l1.val) );
//    		if (l1.next != null) {
//    			l1 = l1.next;
//    		}else {
//    			break;
//    		}
//    	}
//    	while ((Integer)l2.val != null) {
//    		num2List.add(String.valueOf(l2.val) );
//    		if (l2.next != null) {
//    			l2 = l2.next;
//    		}else {
//    			break;
//    		}
//    	}
//    	
////    	System.out.println(num1List.toString());    	
//    	Collections.reverse(num1List);
////    	System.out.println(num1List.toString());   
//    	StringBuilder sb1 = new StringBuilder();
//    	for (String num1 : num1List) {
//    		sb1.append(num1);
//    	}
//    	System.out.println("sb1 : " + sb1.toString());
//    	Collections.reverse(num2List);
//    	StringBuilder sb2 = new StringBuilder();
//    	for (String num2 : num2List) {
//    		sb2.append(num2);
//    	}
//    	System.out.println("sb2 : " + sb2.toString());
//    	
//    	int resultInt = Integer.valueOf(sb1.toString()) + Integer.valueOf(sb2.toString());
//    	System.out.println("result : " + resultInt);
//    	
//    	StringBuilder resultSb = new StringBuilder();
//    	resultSb.append(String.valueOf(resultInt));
//    	resultSb.reverse();
//    	System.out.println("resultSb : " + resultSb);
//    	
//    	//要怎麼根據resultSb去生成listNode??
//    	
//    	
//    	
//    	ListNode result = new ListNode(0);
//    	for (char c : resultSb.toString().toCharArray()) {
//			result.val = Integer.valueOf(c);
//			result.next = new ListNode();
//			result = result.next;
//		}
//
//    	System.out.println("result : " + result);
//    	return l2;
//    	
//    }
}


   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 