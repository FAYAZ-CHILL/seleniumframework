package utils;

public class excelutilsframe {

	public static void main(String[] args) {
		String projectpath = System.getProperty("user.dir");
		excelutils excel = new excelutils(projectpath+"\\excel\\data.xlsx", "Sheet1");
		excel.getrowcount();
		excel.readcelldata(0, 0);
		excel.readcelldatanumber(1, 1);
		excel.getcol();
	}

}
