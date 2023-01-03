package com.yao.demo.trycatchdemo;

public class TryCatchDemo {
	public static void main(String[] args) {
		
		String result = tryCatchFinally();
		System.out.println("result : " + result);
	}


private static String tryCatchFinally() {
	// TODO Auto-generated method stub
	try {
		System.out.println("try");
		return "trying";
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("catch");
		return "catching";
	} //finally會取消前面的return	，所以在finally return沒意義
//	finally {
//		System.out.println("finally");
//		return "finallying";
//		
//	}
}
}
