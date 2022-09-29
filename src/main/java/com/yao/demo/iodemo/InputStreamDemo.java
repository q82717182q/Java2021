package com.yao.demo.iodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
	
	public static void main(String[] args) throws IOException {
		InputStream is = null;
		int i ;
		char c;
		try {
			is = new FileInputStream("/Users/yaochinho/Downloads/jack.txt");
			System.out.println("Characters printed: -------------------------------0");

			while((i = is.read()) != -1)
			{
				c = (char)i;
				System.out.print(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (is!= null ) {
				is.close();
			}
		}
	}
}
