package com.yao.leetcode.n709ToLowerCase;
//A=65, a=97, (char)(A+32)=a
//共用時17分，看錯+成22哪招，看老半天+32才對
public class N709 {
	public static String toLowerCase(String str) {
		String result = "";
		char[] charStr = str.toCharArray();
		for (char c : charStr) {
			System.out.print(c);
		}
		System.out.println("\n==========for=========");
		for (int i = 0; i < charStr.length; i++) {
			if (charStr[i] -'A' >=0&& charStr[i]-'A' <=25) {
				charStr[i] = (char)(charStr[i]+22);
			}
		}
		for (char c : charStr) {
			System.out.print(c);
		}
		System.out.println("\n==========for=========");
		for (char c : charStr) {
			result +=c;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		char i = 'Z';
		char j ;
		String str= "Hello";
		j=(char)(i-25);
		System.out.println(str.charAt(0));
		System.out.println((char)(str.charAt(0)+22));
		System.out.println(j);
//		toLowerCase(str);
	}
}

//用ASCII  A=65~Z=90  a=97~z=122     a-A=32