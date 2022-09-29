package com.yao.leetcode.n1431KidsWiththeGreatestNumberofCandies;

import java.util.ArrayList;
import java.util.List;

public class N1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    	List<Boolean> output = new ArrayList<Boolean>();
    	int max = 0;
    	//找出最大值，注意上下界
    	for (int i = 0; i < candies.length; i++) {
			if (candies[i]-max>0) {
				max = candies[i];
				System.out.printf("(%d)max = %d ",i,max);
			}
		}
    	System.out.println();
//    	加上額外的糖果能超過或等於最大值add(true)
    	for (int i = 0; i < candies.length; i++) {
			if (extraCandies-(max-candies[i]) >= 0) {
				output.add(true);
				System.out.printf("output[%d] = true %n",i);
			}else {
				output.add(false);
				System.out.printf("output[%d] = false %n",i);
			}
		}
    	return output;
        
    }
    public static void main(String[] args) {
    	int[] input = {1,3,9};
    	int i = 4;
    	kidsWithCandies(input,i);
	}
}
