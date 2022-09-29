package com.yao.leetcode.n1342SNumberofStepstoReduceaNumbertoZero;
//看起來就count++ while if 
//注意題目有num = 0 的情況
public class N1342 {
    public static int numberOfSteps(int num) {
        int count = 1;
        if (num==0) {
			return 0;
		}
        while (num != 1) {
        	System.out.println(count+":"+num);
        	if ((num &1) ==0) {
				num/=2;
			}else {
				num-=1;
			}
        	count++;
		}
        return count;
    }
    public static void main(String[] args) {
		int a = 9;
		System.out.println(numberOfSteps(a));
	}
    
    
}
