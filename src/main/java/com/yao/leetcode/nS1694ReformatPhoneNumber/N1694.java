package com.yao.leetcode.nS1694ReformatPhoneNumber;
//我的方式也太慢
//共用時25分
public class N1694 {
    public static String reformatNumber(String number) {
    	//因為要增加所以用sb
    	StringBuilder sb1 = new StringBuilder();
    	//把/與空白清掉
    	String number1 = number.replace("-", "").replace(" ", "");
    	System.out.println(number1);
    	//長度二直接回傳
    	if (number.length()==2) {
    		return number;
		}
    	for (int i = 0; i < number1.length(); i++) {
    		//每次都加上去
    		sb1.append(number1.charAt(i));
    		System.out.println("(1)"+i+") sb1: "+sb1);
    		//每三個數字加上槓但是最後不
    		if ((i+1)%3==0&&i != number1.length()-1) {
				sb1.append("-");
				continue;
			}
    		System.out.println("(2)"+i+") sb1: "+sb1);
    		//如果最後剩四個字，直接回傳
			if (number1.substring(i).length()==4) {
				sb1.append(number1.substring(i+1, i+2));
				sb1.append("-");
				sb1.append(number1.substring(i+2, i+4));
				System.out.println("(3)"+i+") sb1: "+sb1);
				return sb1.toString();
			}
		}
    	
        return sb1.toString();
    }
    
    public static void main(String[] args) {
    	String number = "123 4-567";
    	reformatNumber(number);
    	StringBuilder temp1= new StringBuilder();
	}
}
