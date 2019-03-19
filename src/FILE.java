import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FILE {
	Workbook objworkbook;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FILE obj = new FILE();
		obj.readExcel();
	}
	
	public void readExcel() throws IOException{
		String filePath = System.getProperty("user.dir");
		String fileName = "ExportExcel.xlsx";
		String sheetName = "Sheet1";
	
		objworkbook = null;
		FileInputStream fis = new FileInputStream(new File(filePath+"\\"+fileName));
		String fileExtention = fileName.substring(fileName.indexOf("."));
		if(fileExtention.equalsIgnoreCase(".xlsx")){
			objworkbook = new XSSFWorkbook();
		}
		else if(fileExtention.equalsIgnoreCase(".xls")){
			objworkbook = new HSSFWorkbook();
		}
		
		for(int i=0;i<objworkbook.getNumberOfSheets();i++){
			System.out.println("Sheet Names: "+objworkbook.getSheetName(i));
		}
//		String strSheet = objworkbook.getSheetName(1);
//		Sheet objSheet = objworkbook.getSheet(sheetName);
//		int rowCount = objSheet.getLastRowNum()-objSheet.getFirstRowNum();
//		for(int i=0;i<rowCount;i++){
//			Row R = objSheet.getRow(i);
//			for(int j=0;j<R.getLastCellNum();j++){
//				System.out.print(R.getCell(j).toString()+"\t");
//			}
//			System.out.println();
//		}
//		fis.close();
	}

}
