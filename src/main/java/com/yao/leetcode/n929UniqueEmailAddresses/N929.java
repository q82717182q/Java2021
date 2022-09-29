package com.yao.leetcode.n929UniqueEmailAddresses;

import java.util.HashSet;
import java.util.Set;

//小老鼠後面全部不變
//前面的.忽略  +後面全部刪掉直到遇到小老鼠
//不能重複所以用set
//可是要怎麼判斷遇到+跑到小老鼠
//這邊解答直接用foreach一個解決，而不用雙層for迴圈每個元素慢慢跑慢慢檢查
//只要加上+前面字串跟@後面字串即可，.取代變成沒東西
//共用時26分

public class N929 {
	public int numUniqueEmails(String[] emails) {
		Set<String> set = new HashSet<String>();
		for (String email : emails) {
			String[] parts1 = email.split("@");
			String[] parts2 = parts1[0].split("\\+");
			set.add(parts2[0].replace(".", "") + "@" + parts1[1]);
		}
		return set.size();
	}

	public static void main(String[] args) {
		String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		Set<String> set = new HashSet<String>();

		for (String email : emails) {
			String[] parts1 = email.split("@");
			String[] parts2 = email.split("\\+");
			set.add(parts2[0].replace(".", "") + parts1[1]);
		}
		System.out.println(set.size());
	}

}
