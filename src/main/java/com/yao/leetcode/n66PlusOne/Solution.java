package com.yao.leetcode.n66PlusOne;
/*
 * https://www.itread01.com/content/1546939654.html
 * 從最後一位開始看，假設為九就要進位
 * 多用一個count表示要不要進位
 * 如果全部檢查完都還是九，那就新增一個長度多一個陣列進位放進去回傳
 * 因為int陣列預設為零所以後面元素就不用理會他了
 * 第二個if放裡面外面都給過，我是覺得要放外面啦~
 * 共用時30分
 */
public class Solution {
    public int[] plusOne(int[] digits) {
    	int count = 0;
    	if (digits[digits.length-1]==9) {
			count = 1;
			digits[digits.length-1]= 0;
		}else {
			digits[digits.length-1]+=1;
		}
    	if (count ==1) {
			for (int i = digits.length-2; i >= 0; i--) {
				if (digits[i]%10==9) {
					digits[i] = 0;
				}else {
					count =0;
					digits[i] += 1;
					return digits;
				}
			}
		}
    	if (count ==1) {
			int[] intarr = new int[digits.length+1];
			intarr[0]=1;
			return intarr;
		}
    	return digits;
    }

}

/*
 * 把輸入陣列變成數字在做運算
 * 再放回陣列回傳
 * 
 */
