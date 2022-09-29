package com.yao.leetcode.n728SelfDividingNumbers;
//注意判斷式觀念
/*
 * ||會在左邊true之後就忽略右邊

|會兩邊都運算

int left = 128, n = 120;

if ( n % 10 == 0|| left % (n % 10) != 0 )不會錯

因為個位數為零這條件沒問題，所以就不檢查右邊，右邊其實會變成除數為零所以會報錯，但是不檢查所以沒事。所以以下三種情況都錯，先檢查的除數為零，或是左右都檢查也會檢查到除數為零。

if ( left % (n % 10) != 0 || n % 10 == 0 )會錯

if ( left % (n % 10) != 0 | n % 10 == 0 )會錯

if ( n % 10 == 0| left % (n % 10) != 0 )會錯
 * 
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class N728 {
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> res = new ArrayList<>();
		for (int n; left <= right; left++) {
			for (n = left; n > 0; n /= 10) {
				if ( n % 10 == 0 ||left % (n % 10) != 0) {
					break;
				}
			}
			
			if (n == 0) {
				res.add(left);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int left = 128, right = 128;
//		System.out.println(selfDividingNumbers(left, right));
		int n = 120;
//		if ( left % (n % 10) != 0 ||n % 10 == 0) {
//			System.out.println();
//		}
		if (n % 10 == 0|| left % (n % 10) != 0) {
			System.out.println(true);
		}
	}
}
