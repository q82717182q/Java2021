package com.yao.leetcode.nSS1812DetermineColorofaChessboardSquare;
//共用時七分鐘
public class N1812 {
    public boolean squareIsWhite(String coordinates) {
        boolean ok = true;
        
        char[] c = coordinates.toCharArray();
        
        if (((c[0]-96)+c[1])%2 == 0) {
			ok = false;
		}
        return ok;
    }
}
//用ASCII  a當作1，兩個加起來是偶數就是黑色