package com.yao.leetcode.nSS1704DetermineifStringHalvesAreAlike;

import java.util.HashSet;
import java.util.Set;

public class N1704 {
    public boolean halvesAreAlike(String s) {
        int a = 0;
        int b = 0;
        Set<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        for (int i = 0; i < s.length()/2; i++) {
			if (set.contains(s.charAt(i))) {
				a++;
			}
		}
        for (int i = s.length()/2; i < s.length(); i++) {
			if (set.contains(s.charAt(i))) {
				b++;
			}
		}
        
        
        return a==b;
    }
}
