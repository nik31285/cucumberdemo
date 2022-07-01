package com.cucumberdemo.util;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtil {
	
	public String [] getRow(String filePath,int rowNum) throws IOException {
		String[] data= new String[2];
	    FileInputStream fis=new FileInputStream(filePath);
	    XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    XSSFSheet sheet=workbook.getSheetAt(0);
	    XSSFRow row=sheet.getRow(rowNum);
	    for (int i = 0; i<=1; i++) {
	    	XSSFCell cell=row.getCell(i);
	    	data[i]=cell.getStringCellValue();
		}
	    workbook.close();
	    return data;
	}
}
