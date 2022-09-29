package com.yao.leetcode.n1374GenerateStringWithCharactersThatHaveOddCounts;
//想不到要怎麼只規定奇數個
//這個答案也太敷衍都只有叫a出來啊

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class N1374 {
    public static String generateTheString(int n) {
        char[] arr = new char[n];
        Arrays.fill(arr, 'a');
        if ((n & 1) == 0) {
            arr[0] = 'b';
        }

        return new String(arr);
    }
    public static void main(String[] args) {
    	int n = 12;
		System.out.println(n&1);
		int m = 0111;
		System.out.println(m);
		char[] arr = new char[n];
		Arrays.fill(arr, 'a');
		System.out.println(arr);
		if ((n&1)==0) {
			arr[0]='b';
		}
		System.out.println(arr);
		
		System.out.println(generateTheString(n));
	}
}


//好像自己想太多直接看答案
//public class N1374 {
//    public String generateTheString(int n) {
//        StringBuilder sb1 = new StringBuilder();
//        //隨便生成一個字串
//        for (int i = 0; i < n; i++) {
//			sb1.append((char)((int)(Math.random()*26)+'a'));
//		}
//        //儲存該字串每個字母出現次數
//        Map<Character, Integer> map = new HashMap<Character, Integer>();
//        for (int i = 0; i < n; i++) {
//			if (map.containsKey(sb1.charAt(i))) {
//				map.put(sb1.charAt(i), map.get(sb1.charAt(i))+1);
//			}else {
//				map.put(sb1.charAt(i), 1);
//			}
//		}
//        return sb1.toString();
//    }
//    public static void main(String[] args) {
//		System.out.println((char)((int)(Math.random()*26)+'a'));
//	}
//}
