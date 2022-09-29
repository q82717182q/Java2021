package com.yao.leetcode.n1455CheckfaWordOccursaPrefixofAnyWordinaSentence;
//共用時20分
public class N1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
     	//計數
    	int count = 0;
    	//走訪每個單字
    	for (String s : sentence.split(" ")) {
    		count ++;
    		//字數小就跳過不用比
    		if (s.length() < searchWord.length()) {
				continue;
			}
    		//比較是否相同
    		if (searchWord.equals(s.substring(0,searchWord.length()))) {
				return count;
			}
		}
    	//都沒有就回傳-1
        return -1;
    }
    
    
    public static void main(String[] args) {
    	String sentence = "i love eating burger";
    	String searchWord = "burg" ;
    	int count = 0;
    	for (String s : sentence.split(" ")) {
    		count ++;
    		if (s.length() < searchWord.length()) {
				continue;
			}
    		if (searchWord.equals(s.substring(0,searchWord.length()))) {
				System.out.println(count);
			}
		}
    	
    	
    	
	}
}
