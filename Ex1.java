package DataDRiven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ex1 {
	 public static String[] columns = {"Name", "Email", "Date Of Birth", "Salary"};
	
	public static void main(String[] args) throws IOException {
		
		/*
		SHEET
		ROW
		CELL*/
		
		
		File file=new File("C:\\Users\\rockstr\\eclipse-workspace\\RTE\\suresh.xlsx");
		 
		FileOutputStream fout=new FileOutputStream(file);
		
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		//HSSFWorkbook workbook=new HSSFWorkbook();
		
		
		XSSFSheet createSheet = workbook.createSheet("employee");
		
		XSSFRow ROW = createSheet.createRow(0);
		
		 for(int i = 0; i < columns.length; i++) {
	            Cell cell = ROW.createCell(i);
	            
	            
	            cell.setCellValue(columns[i]);
	           
	        }
		 workbook.write(fout);
		 workbook.close();
	
		System.out.println("line is working");
		
		
}}