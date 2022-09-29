package com.yao.leetcode.nSS657RobotReturntoOrigin;
//共用時七分鐘
public class N657 {
	public boolean judgeCircle(String moves) {
		//分為水平垂直
		int horizon = 0;
		int vertical = 0;
		if ((moves.length() & 1)!=0) {
			return false;
		}
		for (int i = 0; i < moves.length(); i++) {
			//垂直運算
			if (moves.charAt(i) == 'U') {
				vertical++;
			} else if (moves.charAt(i) == 'D') {
				vertical--;
			} else if (moves.charAt(i) == 'L') {
				//水平運算
				horizon++;
			} else if (moves.charAt(i) == 'R') {
				horizon--;
			}else {
				//輸入錯誤字
				return false;
			}

		}
		//回傳結果是否皆為零
		return horizon==0&&vertical==0;

	}
}
