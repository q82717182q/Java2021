package com.yao.leetcode.n136SingleNumber;

import java.util.HashMap;
import java.util.Map;

/*
 * https://woooooooooord.wordpress.com/2016/11/27/leetcode-136-single-numberjava/
xor 就是用^
我們可以把它簡單看成，會把包含在自己裡面的數減去，
把不包含在自己裡面的數相加(有負數的情況會更複雜一些)，
所以在此題的假設下，這樣做就可以輕鬆找出落單的數字啦!
共用時37分
 */
public class Solution {
	public int singleNumber(int[] nums) {
		int xor = 0;
		for (int i : nums) {
			xor ^=i;
		}
		return xor;
	}
}

/*
 * 利用for回圈找到第一個數存起來 之後又找到的數比對存起來的，
 * 沒有就另外存起來 如果比對到一樣的就一起刪除 
 * 直到最後留下來的數字就他一個
 * 
 * 或是一個一個比對有相同就跳下一個  沒有就return
 * 
 */
