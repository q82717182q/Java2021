package com.yao.leetcode.n1684CounttheNumberofConsistentStrings;
import java.util.ArrayList;
import java.util.List;
//請用list或是set都可以，要判斷是否包含用這個比較快，不用一個一個去比
//共用時38分，別想太久可以直接看答案先看觀念對不對在開始寫
public class N1684 {
	 public int countConsistentStrings(String allowed, String[] words) {
	        int result = 0;
	        List<Character> list = new ArrayList<Character>();
	        for (int i = 0; i < allowed.length(); i++) {
				list.add(allowed.charAt(i));
			}
	        
	        for (String word : words) {
	        	boolean ok = true;
				for (int i = 0; i < word.length(); i++) {
					if (!list.contains(word.charAt(i))) {
						ok = false;
						break;
					}
				}
				if (ok) {
					result++;
				}
			}
	        return result;
	    }
	 public static void main(String[] args) {
		 String allowed = "ab";
		 String[] words ={"ad","bd","aaab","baa","badab"};
		 
		 int result = 0;
	        boolean temp = true;
	        List<Character> list = new ArrayList<Character>();
	        
	        for (int i = 0; i < allowed.length(); i++) {
				list.add(allowed.charAt(i));
			}
	        for (String word  : words) {
				boolean ok = true;
				for (int i = 0; i < word.length(); i++) {
					if (!list.contains(word.charAt(i))) {
						ok = false;
						break;
					}
				}
				if (ok) {
					result++;
				}
			}
	        
	        
	        
	        
	}
}


//把點茶字元拿進去比對