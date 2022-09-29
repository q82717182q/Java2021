package com.yao.leetcode.nS1678GoalParserInterpretation;
//看答案邏輯一次過，共用時13分
public class N1678 {
	public String interpret(String command) {
		String result = "";

		char[] com = command.toCharArray();
		for (int i = 0; i < com.length; i++) {
			if (com[i]=='(') {
				if (com[i+1]==')') {
					result += "o";
					continue;
				}
				continue;
			}
			if (com[i]==')') {
				continue;
			}
			result += com[i];
		}
		return result;

	}
	public static void main(String[] args) {
		String command =  "G()()()()(al)";

	}
}

//split好像不管用，直接看解答吧