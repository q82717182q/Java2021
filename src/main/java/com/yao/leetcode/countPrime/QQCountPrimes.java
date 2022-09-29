package com.yao.leetcode.countPrime;
/* 實際上我們只需要計算到根號n
 * 把原本想的第二層for迴圈直接做成一個方法就不用兩層了，而且可以給大家用
 * 而且質數的倍數都不用在試了可以跳過，這樣速度更快
 * 而且可以i++一個一個試的過程，總是從i^2開始去試，因為
 * 剩下布林矩陣優化還沒做
 * */
public class QQCountPrimes {
	public static void main(String[] args) {
		int n = 2;
		System.out.println(countPrimes(n));
	}
	public static int countPrimes(int n) {
		int primeCount = 0;
		if(n <= 1) {return 0;}
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				primeCount++;
			}
		}
		System.out.println("(primeCount)"+primeCount);
		return primeCount;
	}
	public static boolean isPrime(int num) {
		if (num <=1) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
/*
 * 計算質數 第一層for迴圈i++從2開始加到自己的一半 
 * 第二層for迴圈把i除以j++直到自己的一半，i%j ==0就代表該i是質數印出來
 * break回到i++繼續執行，直到i++自己的一半結束 顯示結果
 * 
 * 
 */
