package com.yao.leetcode.nS1266MinimumTimeVisitingAllPoints;
//共用時44分
public class N1266 {
public static int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        int[] start = new int[2];
        int[] end = new int[2];
        for (int i = 0; i < points.length-1; i++) {
        	start = points[i];
        	end = points[i+1];
        	System.out.printf("start[0]:%d end[0]:%d start[1]:%d end[1]:%d"
        			,start[0],end[0],start[1],end[1]);
        	System.out.println("\n while "+!((start[0]==end[0]) && (start[1]==end[1])));
			while (!(start[0]==end[0] && start[1]==end[1])) {//注意這邊判斷
				if (start[0]<end[0] && start[1]<end[1]) {//同時不等於就xy都增減
					start[0]++;
					start[1]++;
					result++;
				}
				if (start[0]>end[0] && start[1]<end[1]) {
					start[0]--;
					start[1]++;
					result++;
				}
				if (start[0]>end[0] && start[1]>end[1]) {
					start[0]--;
					start[1]--;
					result++;
				}
				if (start[0]<end[0] && start[1]>end[1]) {
					start[0]++;
					start[1]--;
					result++;
				}
				if (start[0]<end[0] && start[1]==end[1]) {//同時只有一軸不等於就該軸去增減
					start[0]++;
					result++;
				}
				if (start[0]==end[0] && start[1]<end[1]) {
					start[1]++;
					result++;
				}
				if (start[0]>end[0] && start[1]==end[1]) {
					start[0]--;
					result++;//[[3,2],[-2,2]]執行這行
				}
				if (start[0]==end[0] && start[1]>end[1]) {
					start[1]--;
					result++;
				}
			}
		}
        System.out.println("\n"+result);
        return result;
    }
public static void main(String[] args) {
	int[][] points = {{1,1},{3,4},{-1,0}};
	int[][] points1 = {{3,2},{-2,2}};
	minTimeToVisitAllPoints(points1);
	
	
	
}
}
