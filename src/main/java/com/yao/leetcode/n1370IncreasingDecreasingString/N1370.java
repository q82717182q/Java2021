package com.yao.leetcode.n1370IncreasingDecreasingString;
//不用考慮何時停下來，反正就一路加過去還沒歸零就加
//加到底停了在另一個for迴圈加回來
//共用時20分
public class N1370 {
    public String sortString(String s) {
    	StringBuilder sb1 = new StringBuilder();
        //放置字母的矩陣
    	int[] arr = new int[26];
    	//把字母放到矩陣
    	for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)-'a']++;
		}
        //直到長度跟s一樣才停下來
    	while (sb1.length()<s.length()) {
    		//正序加過去
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]!=0) {
					sb1.append((char)(i+'a'));
					arr[i]--;
				}
			}
			//反序加回來
			for (int i = arr.length-1; i >= 0; i--) {
				if (arr[i]!=0) {
					sb1.append((char)(i+'a'));
					arr[i]--;
				}
			}
		}
    	return sb1.toString();
    	
        
        
        
    }
    
    public static void main(String[] args) {
    	String s = "aaaabbbbcccc";
    	String result ="";
        StringBuilder sb1 = new StringBuilder();
        //統計的字符種類
        int[] abc = new int[26];
        //統計每種字符
        for (int i = 0; i < s.length(); i++) {
			abc[s.charAt(i)-'a']++;
		}
        while (sb1.length()<s.length()) {
			for (int i = 0; i < abc.length; i++) {
				if (abc[i]!=0) {
					sb1.append((char)(i+'a'));
					abc[i]--;
				}
			}
			for (int i = abc.length-1; i >= 0; i--) {
				if (abc[i]!=0) {
					sb1.append((char)(i+'a'));
					abc[i]--;
				}
			}
			
		}
        System.out.println(sb1);
        
	}
}
