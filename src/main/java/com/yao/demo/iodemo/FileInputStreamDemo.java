package com.yao.demo.iodemo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fi=null;
		try{
		fi = new FileInputStream("c:\\search.xls");
		}catch(IOException ioe){
		}finally{
		if(fi != null){
		fi.close();
		}
		fi = null;//This will be hint to get finalize() called on fi so that underlying resources used will released like files opened.
		}
	}
}
