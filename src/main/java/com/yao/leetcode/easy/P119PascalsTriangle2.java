package com.yao.leetcode.easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P119PascalsTriangle2 {
	public static void main(String[] args) {
		new Solution().getRow(5);
	}
	
}
class Solution {
    public List<Integer> getRow(int rowIndex) {
    	System.out.println("rowIndex : " + rowIndex);
    	List<Integer> results = new ArrayList<>();
    	List<Integer> inputList = new ArrayList<>();
    	
//    	inputList.add(1);
    	
//    	inputList.add(1);
//    	inputList.add(2);
//    	inputList.add(1);
    	
    	
//    	inputList.add(1);
//    	inputList.add(3);
//    	inputList.add(3);
//    	inputList.add(1);
    	
    	inputList.add(1);
    	inputList.add(4);
    	inputList.add(6);
    	inputList.add(4);
    	inputList.add(1);
    	
//    	if (rowIndex == 0) {
//    		results.add(1);
//			return results;
//		}
//    	if (rowIndex == 1) {
//    		results.add(1);
//    		results.add(1);
//    		return results;
//    	}
//    	
//    	for (int i = 2; i <= rowIndex; i++) {
//			int leftIndex = 0;
//			int rightIndex = 1;
//			
//			for (int rightIndex = 0; rightIndex <= i; j++) {
//				
//			}
//			
//			
//		}
//    	
    	
    	inputList.add(0, 0);		
    	inputList.add(inputList.size(), 0);
    	System.out.println("inputList : " + inputList);
    	
    	
    	
//    	for (int j = 0; j < rowIndex; j++) {
//			
//  
//		}
    	
    	getSubRow(inputList);
		System.out.println("results : " + results);
    	System.out.println("results : " + results);
        return null;
    }
    
    public List<Integer> getSubRow(List<Integer> inputList){
    	int leftIndex = 0;
    	int rightIndex = 1;
    	List<Integer> tempList = new ArrayList<>();

    	for (int i = 0; i < inputList.size()-1; i++) {
			System.out.println("vvvvvvvvvvvvvvloop-" + i);
//		System.out.println("inputList.size() : " + inputList.size());
//		System.out.println("leftIndex : " + leftIndex);
//		System.out.println("rightIndex : " + rightIndex);
//		System.out.println("inputList.get(leftIndex) : " + inputList.get(leftIndex));
//		System.out.println("inputList.get(rightIndex) : " + inputList.get(rightIndex));
			if (leftIndex == 0) {
				tempList.add(1);
			}else if (rightIndex == inputList.size()) {
				tempList.add(inputList.get(leftIndex));
			}else {
				tempList.add(inputList.get(leftIndex) + inputList.get(rightIndex));
			}
			
			leftIndex++;
			rightIndex++;
			System.out.println("tempList : " + tempList);
			System.out.println("--------------loop-" + i);
			System.out.println("\n");
		}
    	return tempList;
    }
}