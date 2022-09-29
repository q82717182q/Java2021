package com.yao.leetcode.implementStr;

/*Brute Force
 * #28 Implement strStr()
 * 第二層for開始比對之後haystack的索引用i+j
 * 而且等於就沒事所以要用!=
 * 判斷長度是否大於haystack應該要用i+needle因為隨著i遞增要看總長有沒有超過
 * 
 * */
public class Str {
	public static void main(String[] args) {
		System.out.println(strStr("mississippi", "issipi"));
	}

	public static int strStr(String haystack, String needle) {
		if (needle.isEmpty()) {
			return 0;
		}

		for (int i = 0, j; i < haystack.length(); i++) {
			if (i + needle.length() > haystack.length()) {
				return -1;
			}
			if (haystack.charAt(i) == needle.charAt(0)) {
				for (j = 1; j < needle.length(); j++) {
					if (haystack.charAt(i + j) != needle.charAt(j)) {
						break;
					}
				}
				if (j == needle.length()) {
					return i;
				}
			}
		}

		return -1;
	}

}
/*
 * 長度不對根本無法比對也要列進去 字串可以直接用.isEmpty()就不用.equals(""))了 不用char[]可以直接用charAt在for迴圈比對
 * 
 */
//	public static int strStr(String haystack, String needle) {
//		int index = 0;
//		String h = haystack;
//		String n = needle;
//		if (needle.equals("")) {
//			return 0;
//		}
//		char[] ch = new char[h.length()];
//		char[] cn = new char[n.length()];
//		for (int i = 0; i <= ch.length - cn.length; i++) {
//			if (ch[i] == cn[0]) {
//				for (int j = 0; j < cn.length; j++) {
//				}
//			}
//		}
//		return index;
//	}
//	public static void main(String[] args) {
//	}
/*
 * if needle 為return 0 把haystack和needle丟到char矩陣中以便比對needle 用for迴圈
 * 從haystack第一個字開始與needle比對 如果比對到第一個次相同進入另一個for回圈 開始比對是否與needle全部相同 直到全部一樣
 * 則回傳第一個一樣的字的index
 * 
 * 
 * 
 */