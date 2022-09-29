package com.yao.leetcode.nQQ190ReverseBits;
/*
 * stringbuilder方式如果0就掛了
 * 看不懂在寫什麼啊＠＠
 * 
 * n&1到底是啥
 * https://openhome.cc/Gossip/Java/Operator.html
 * 位元運算子& 就是and，所以這邊可以當作是判斷是否為0或1
 * >>=	a >>= b	a = a >> b
 * 然後推出去的位元就會拋棄
 * result括號記得要加不然會報錯
 * ＱＱ？可是這邊n最大只有2147483647為啥可以輸入00000010100101000001111010011100去測試
 * 共用時53分
 */
//you need treat n as an unsigned value
public class Solution { 
	 public int reverseBits(int n) { 
		 int result = 0;
		 for (int i = 0; i < 32; i++) {
			result = result<<1 + n&1;
			n >>= 1;
		}
		 return result;
	 }
}



/*
 * 將二進位數字變成stringbuilder再反轉在變成十進位再輸出
 */
