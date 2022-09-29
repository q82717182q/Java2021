package com.yao.leetcode.n883SProjectionAreaof3DShapes;
/*
 * ＸＸ這個題目有點難看懂，不過大致上是哪個面看過去就忽略第三格軸的元素，
 * 是除了xy投影之外，另外兩個投影是看該軸上最大值
 * 也就是正面不為零的話就是n*n的正方形，有零就有缺角
 * 剩下兩面的投影，一個是每個元素成員內最大值和，另一個是每個元素同樣位置比較的最大值和，
 * 兩者種和相加再加上正面投影（基本是正方形）就是答案
 */
public class N883 {
    public static int projectionArea(int[][] grid) {
        int xy = grid[0].length *grid[0].length;
        int xz = 0;//每一個子陣列內互相比較的最大值
        int yz = 0;//每一個子陣列相應位置最大值
        
        for (int i = 0; i < grid.length; i++) {
        	int xzMax = 0;
        	int yzMax = 0;
			for (int is : grid[i]) {
				xzMax = Math.max(xzMax, is);
				if (is == 0) {
					xy--;
				}
			}
			for (int j = 0; j < grid.length; j++) {
				yzMax = Math.max(yzMax, grid[j][i]);
			}
			yz += yzMax ;
			xz += xzMax;
		}
        return xy+xz+yz;
    }
    public static void main(String[] args) {
    	int[][] grid = {{1,2},{3,4}};
    	projectionArea(grid);
	}
}
