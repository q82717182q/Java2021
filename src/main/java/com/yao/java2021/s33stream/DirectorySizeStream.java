package com.yao.java2021.s33stream;

import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * Created by Jack Yao on 2022/2/12 3:22 PM
 */
//得到目錄大小，目錄大小是其中所有文件的總和\
    //Files.list是1.8之後才添加的流方法
    //這邊用到parallel方法，並行方法效率更高
    //運行時輸入 . 代表當前目錄
public class DirectorySizeStream {
    public static void main(String[] args) {
        System.out.println("Enter a directory or a file : ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();
        System.out.println(getSize(new File(directory)) + " bytes ");

    }

    private static long getSize(File file) {
        if (file.isFile()){
            return file.length();//返回檔案長度
        }else {
            try {
                //list()方法 : 會返回一個字元陣列,將制定路徑下的檔案或資料夾名字儲存到String陣列中
                //toFile()方法
                return Files.list(file.toPath()).parallel()
                        .mapToLong(e -> getSize(e.toFile())).sum();
            }catch (Exception ex){
                return 0;
            }
        }

    }
}
