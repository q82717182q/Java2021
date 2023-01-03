package com.yao.demo.leetcode.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * @author yaochinho
 *
 * @date 2022年10月12日
 */
public class P4MedianOfTwoSortedArrays {
	public static void main(String[] args) {

		int[] nums1 = new int[] { 1, 2 };

		int[] nums2 = new int[] { 3, 4 };
		int[] nums3 = new int[] { 2, 2, 4, 4 };
		int[] nums4 = new int[] { 2, 2, 4, 4 };

//		System.out.println(findMedianSortedArrays(nums1,nums2));
		System.out.println(findMedianSortedArrays(nums3, nums4));
	}

	// 這個是沒去重複版本 花費30m 自己完成
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
		List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

		list1.addAll(list2);
		Collections.sort(list1);
		System.out.println(list1);
		if (list1.size() % 2 == 1) {
			return list1.get(list1.size() / 2);
		} else {
			double right = list1.get(list1.size() / 2);
			double left = list1.get(list1.size() / 2 - 1);
			return (left + right) / 2.0;
		}

	}
//    //這個是有去重複版本，題目不用去除重複
//    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//    	
//    	List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
//    	List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
//    	
//    	Set<Integer> set = new HashSet<>(list1);
//    	
//    	set.addAll(list2);
//    	System.out.println(" set : " + set);
//    	
//    	List<Integer> sordList = new ArrayList<>(set);
//    	Collections.sort(sordList);
//    	
//    	if (sordList.size() % 2 == 1) {
//    		return sordList.get(sordList.size()/2);
//    	}else {
//    		double right = sordList.get(sordList.size()/2);
//    		double left = sordList.get(sordList.size()/2 - 1) ;
//    		return (left + right) / 2.0;
//    	}
//    	
//    }
}
