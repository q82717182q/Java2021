package com.yao.leetcode.nS169MajorityElement;

import java.util.HashMap;
import java.util.Map;
/*
 * https://medium.com/leetcode-%E6%BC%94%E7%AE%97%E6%B3%95%E6%95%99%E5%AD%B8/048-leetcode-169%E6%BC%94%E7%AE%97%E6%B3%95-majority-element-%E6%B1%82%E5%A4%9A%E6%95%B8%E5%85%83%E7%B4%A0-1d8af4ca951a
 * 居然第一次run寫對了感動
 * 而且還只錯一個地方就過submit了
 * 共用時30分
 */
public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
        if (nums == null) {
			return 0;
		}
        for (int i = 0; i < nums.length; i++) {
        	if (m1.containsKey(nums[i])) {
        		m1.put(nums[i], m1.get(nums[i])+1);
			}else {
				m1.put(nums[i], 1);
			}
        	if (m1.get(nums[i]) > nums.length/2) {
				return nums[i];
			}
		}
        return 0;
    }
}


/*
 * 前面有學到有人用map的方式把元素當成key
 * 然後出現次出當成value
 * 最後回傳出現最多次且大於n/2的數
 * 要不要邊檢查呢～
 * 
 */

