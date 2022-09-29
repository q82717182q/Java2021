package com.yao.leetcode.n1281SSSubtracttheProductandSumofDigitsofanInteger;


public class N1281 {
	public static int subtractProductAndSum(int n) {
		if (n == 0)
			return 0;
		int sum = 0;
		int product = 1;
		int count = 1;
		while (n!=0) {
			
			System.out.println(count+"n:"+n+"\tproduct:"+product+"\tsum:"+sum);
			product *= n%10;
			sum += n%10;
			n /= 10;
			System.out.println(count+"n:"+n+"\tproduct:"+product+"\tsum:"+sum);
			count++;
		}
		
		return product-sum;
		
	}
	public static void main(String[] args) {
		int n = 234;
		subtractProductAndSum(n);
		System.out.println(n/10);
		System.out.println(n/10);
	}
}
