package com.yao.demo.filedemo;
/*
 * @author Jack
 * @date 2022/12/22
 * */

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadExcelFileDemo {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook excel = new XSSFWorkbook("/Users/yaochinho/Downloads/20221222-法規EU-POPs_Jack.xlsx");
        XSSFSheet excelSheet = excel.getSheetAt(0);
        int numberOfRows = excelSheet.getPhysicalNumberOfRows();
        for (int i = 0; i < numberOfRows; i++) {
            XSSFRow row = excelSheet.getRow(i);
            if (isEmptyRow(row)){
                continue;
            }
            int numberOfCells = row.getLastCellNum();

            for (int j = 0; j < numberOfCells; j++) {
                System.out.println(row.getCell(j).getStringCellValue());
            }
        }
    }
    private static boolean isEmptyRow(XSSFRow row) {
        for (int i = 0; i < row.getLastCellNum(); i++) {
            if (row.getCell(i) == null || row.getCell(i).getCellType() != CellType.BLANK){
                return false;
            }
        }
        return true;
    }
}
