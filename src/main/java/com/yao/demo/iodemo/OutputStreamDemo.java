package com.yao.demo.iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamDemo {

	public static void main(String[] args) throws IOException {
		InputStream is = null;
		int i ;
		char c;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("/Users/yaochinho/Downloads/jack.txt");
			System.out.println("Characters printed: -------------------------------0");
//			os = new FileOutputStream(new File("/Users/yaochinho/Downloads/jack123.txt"));
			os = new FileOutputStream(new File("/Users/yaochinho/Downloads/jack123.html"));
            byte[] bytes = new byte[1024];

			while((i = is.read(bytes)) != -1)
			{
				System.out.println("i : " + i);
				os.write(bytes, 0, i);
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
