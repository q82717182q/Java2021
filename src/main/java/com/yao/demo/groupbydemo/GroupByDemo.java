package com.yao.demo.groupbydemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class GroupByDemo {
	public static void main(String[] args) {
		GroupByDemo gbd = new GroupByDemo();
		gbd.groupBy(null, null);
	}
	
	public <T, R> Map<R, Collection<T>> groupBy(Collection<T> collect, Function<T, R> groupKey){
		
		Map<Object, Object> map = new HashMap<>();
		
		return null;
		
	}
}
