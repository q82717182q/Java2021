package com.yao.leetcode.n1408StringMatchinginanArray;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//從短的開始比對
//看答案吧
//共用時30分
public class N1408 {
    public List<String> stringMatching(String[] words) {
    	Set<String> set1 = new HashSet<String>();
    	for (int i = 0; i < words.length; i++) {
			int count = 0;
    		while (count < words.length) {
				if (i == count) {
					count++;
				}else if(words[i].contains(words[count])) {
					set1.add(words[count]);
					count++;
				}else {
					count++;
				}
    			
			}
		}
    	return set1.stream().collect(Collectors.toList());
    }
    public static void main(String[] args) {
    	// creating a Stream of strings 
        Stream<String> s = Stream.of("Geeks", 
                                     "for", 
                                     "GeeksforGeeks", 
                                     "Geeks Classes"); 
        // using Collectors toList() function 
        List<String> myList = s.collect(Collectors.toList()); 
        //test push 20220125
        // printing the elements 
        System.out.println(myList); 
	}
}
