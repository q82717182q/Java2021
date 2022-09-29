package com.yao.leetcode.n1446SS;
//找出現最多字數
//而且要連在一起
//例外獨立出來
//共用時20分
public class N1446 {
	public static int maxPower(String s) {
        int result = 0;
        int max = 1;
        int count = 0;
        for (int i = 0; i < s.length()-1; i++) {
        	//出現連續時
			if (s.charAt(i)==s.charAt(i+1)) {
				max++;
				count++;
				result = Math.max(max, result);
			}else {
				max =1;
			}
		}
        //完全沒出現過連續時
        if (count != 0) {
			return result;
		}
        return 1;
        
	}
	public static void main(String[] args) {
		String s = "leetcode";
		maxPower(s);
	}
}
