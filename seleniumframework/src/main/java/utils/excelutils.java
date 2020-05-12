package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutils {
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public excelutils(String excelpath, String sheetname) {
		try {
		workbook = new XSSFWorkbook(excelpath);
		sheet = workbook.getSheet(sheetname);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		public static void main(String[] args) {
			getrowcount();
			readcelldata(0,0);
			readcelldatanumber(1,1);
			getcolcount();
		}
	
	public static int getrowcount() {
		int rowcount = 0;
		try {
		rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("number of rows:"+rowcount);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowcount;
	}
	
	public static String readcelldata(int rowNum, int colNum) {
		String cellData=null;
		try {
		cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println(cellData);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}
	
	public static double readcelldatanumber(int rowNum, int colNum) {
		double cellData=0;
		try {
		cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(cellData);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}
	
	public static int getcolcount() {
		int colcount=0; 
		try {
			colcount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("number of colums:"+colcount);
		}catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}
		return colcount;
	}
}
