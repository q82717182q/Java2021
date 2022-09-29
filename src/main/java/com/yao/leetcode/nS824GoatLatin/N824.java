package com.yao.leetcode.nS824GoatLatin;
//共用時15分
public class N824 {

	public String toGoatLatin(String S) {
		//記數看每個元素要加幾個a
    	int count = 1;
    	//最後結果
    	String result= "";
    	//開始走訪每個元素
    	for (String s : S.split(" ")) {
    		//要能添加所以用sb
    		StringBuilder sb1 = new StringBuilder();
    		sb1.append(s);
    		//檢查每個元素的開頭為母音會子音
    		if (s.charAt(0) == 'a'||s.charAt(0) == 'e'||
    				s.charAt(0) == 'i'||s.charAt(0) == 'o'||
    				s.charAt(0) == 'u'||s.charAt(0) == 'A'||
    				s.charAt(0) == 'E'||s.charAt(0) == 'I'||
    				s.charAt(0) == 'O'||s.charAt(0) == 'U') {
				sb1.append("ma");
			}else {
                
				sb1.append(sb1.charAt(0));
                sb1.append("ma");
				sb1.deleteCharAt(0);
			}
    		//依據count決定要加上幾個a
    		for (int i = 1; i <= count; i++) {
    			sb1.append("a");
			}
    		sb1.append(" ");
    		count++;
    		//存到結果
			result +=sb1.toString();
		}
    	//因為多一個空白所以最後要剪掉
    	return result.substring(0, result.length()-1);
    }
    
    
    
    public static void main(String[] args) {
		
    	
    	String S1 = "I speak Goat Latin";
    	int count = 1;
    	String result= "";
    	for (String s : S1.split(" ")) {
    		StringBuilder sb1 = new StringBuilder();
    		sb1.append(s);
    		if (s.charAt(0) == 'a'||s.charAt(0) == 'e'||
    				s.charAt(0) == 'i'||s.charAt(0) == 'o'||
    				s.charAt(0) == 'u'||s.charAt(0) == 'A'||
    				s.charAt(0) == 'E'||s.charAt(0) == 'I'||
    				s.charAt(0) == 'O'||s.charAt(0) == 'U') {
				sb1.append("ma");
			}else {
				sb1.append("ma");
				sb1.append(sb1.charAt(0));
				sb1.deleteCharAt(0);
			}
    		for (int i = 1; i <= count; i++) {
    			sb1.append("a");
			}
    		sb1.append(" ");
    		count++;
			System.out.println(count+" "+sb1);
			result +=sb1.toString();
		}
    	result.substring(0, result.length()-1);
    	System.out.println(result);
	}
}
