package com.yao.demo.breakdemo;

public class BreakDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		for (int i = 0; i < a; i++) {
			try {
				System.out.println(add(a,i));
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
//				break;
			}
		}
	}

	private static int add(int a, int i) {
		// TODO Auto-generated method stub
		return a + i;
	}
}
