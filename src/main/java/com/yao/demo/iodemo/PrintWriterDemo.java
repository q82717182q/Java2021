package com.yao.demo.iodemo;

import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) {

		char c = 'a';
		int count = 0;

		// create a new writer
		PrintWriter pw = new PrintWriter(System.out);

		// write char
		pw.write(c);
		pw.write('b');

		while (count <= 999999) {
			pw.write('b');
			count ++;
			if (count % 1000 == 0) {
				System.out.println("count : " + count);
			}
		}
		// flush the writer
//		pw.flush();

	}
}
