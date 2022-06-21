package com.cucumberdemo.stepdefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.cucumberdemo.util.ExcelUtil;

//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExcelRead {
	@Given("read data from {string}")
	public void read_data_from(String row) throws IOException {
		int rowNum=Integer.parseInt(row);
		System.out.println(rowNum);
		String base=System.getProperty("user.dir");
		String filePath=base+"\\src\\test\\resources\\State_Code.xlsx";
	    ExcelUtil read=new ExcelUtil();
	    String [] code=read.getRow(filePath, rowNum);
	    for (String val : code) {
			System.out.println(val+":");
		}
	}


}
