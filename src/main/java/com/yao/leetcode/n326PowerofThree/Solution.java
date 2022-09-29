package com.yao.leetcode.n326PowerofThree;
/*
 * 
 * <=0可以先排除掉
 * ==1 是零次方
 * 直接呼叫自己等於是用回圈
 * https://www.itread01.com/content/1541890933.html
 * 其實連for回圈都不用
 * 
 * 解法3（別人的）
題目中的Follow up讓我們不用迴圈，那麼有一個投機取巧的方法，
由於輸入是int，正數範圍是0-231，在此範圍中允許的最大的3的次方數為319=1162261467，
那麼我們只要看這個數能否被n整除即可
共用時29分
 */
public class Solution {
    public boolean isPowerOfThree(int n) {
    	if (n <= 0) {
			return false;
		}  
    	if (n == 1) {
			return true;
		}
    	if (n%3!=0) {
			return false;
		}
    	return isPowerOfThree(n/3);
    }
}

/*
 * 就一直用for迴圈一直/3直到/3 ==1就可以了
 */

