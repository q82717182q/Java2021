package com.yao.leetcode.n242ValidAnagram;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * https://medium.com/leetcode-%E6%BC%94%E7%AE%97%E6%B3%95%E6%95%99%E5%AD%B8/015-leetcode-242%E6%BC%94%E7%AE%97%E6%B3%95-valid-anagram-%E9%A9%97%E8%AD%89%E6%98%93%E4%BD%8D%E6%A7%8B%E8%A9%9E-9111f3ef8102
 * 存取直接用toCharArray就好不用for回圈一個一個慢慢存
 * 再用array自己有的sort方法排序之後就可以比了
 * 然後等於也要用陣列不能用s1.equals(t1)
 * 
 * 另一種ascii算法也不賴，但是也沒比較快
 * 共用時30分
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
    	if (s.length() !=t.length()) {
			return false;
		}
    	char[] s1 = s.toCharArray();
    	char[] t1 = t.toCharArray();
    	Arrays.sort(s1);
    	Arrays.sort(t1);

     return Arrays.equals(s1, t1);   
    }
}

/*
 * OO長度不對就不用比了
 * XX利用ch矩陣存入後再foreach開始比對
 * 這是這樣要怎麼比對
 * 還是一樣用hashmap看每個字母的數量
 */
