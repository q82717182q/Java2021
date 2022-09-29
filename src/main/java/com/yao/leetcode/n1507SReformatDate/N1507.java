package com.yao.leetcode.n1507SReformatDate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//用map對應，慢慢存入
//day直接取數字就好，不用慢慢存

/*好慢
 * 用時30分
 * Runtime: 8 ms, faster than 29.54% of Java online submissions for Reformat Date.
Memory Usage: 37.8 MB, less than 27.66% of Java online submissions for Reformat Date.
 * 
 * 
 */
public class N1507 {
    public static String reformatDate(String date) {
        String result = "";
        String[] arrDate = date.split(" ");
        Map<String, String> Month = new HashMap<String, String>();
        Month.put("Jan", "01");
        Month.put("Feb", "02");
        Month.put("Mar", "03");
        Month.put("Apr", "04");
        Month.put("May", "05");
        Month.put("Jun", "06");
        Month.put("Jul", "07");
        Month.put("Aug", "08");
        Month.put("Sep", "09");
        Month.put("Oct", "10");
        Month.put("Nov", "11");
        Month.put("Dec", "12");
        arrDate[0] = arrDate[0].substring(0, arrDate[0].length()-2);
        System.out.println(arrDate[0]);
        if (arrDate[0].length()==1) {
        	arrDate[0] = "0"+arrDate[0];
		}
        result += arrDate[2]+"-"+Month.get(arrDate[1])+"-"+arrDate[0];
        return result;
    }
    public static void main(String[] args) {
    	String date = "20th Oct 2052";
    	reformatDate("20th Oct 2052");
	}
}
