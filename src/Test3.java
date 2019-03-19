

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Test3 {
	

public void readExcel() throws IOException{
		String filePath = System.getProperty("user.dir")+"/src/main/java/data";
		String fileName = "ExportExcel.xlsx";
		String sheetName = "UserData";
	
		Workbook objworkbook = null;
		FileInputStream fis = new FileInputStream(new File(filePath+"\\"+fileName));
		String fileExtention = fileName.substring(fileName.indexOf("."));
		if(fileExtention.equalsIgnoreCase(".xlsx")){
			objworkbook = new XSSFWorkbook();
		}
		else if(fileExtention.equalsIgnoreCase(".xls")){
			objworkbook = new HSSFWorkbook();
		}
		
		Sheet objSheet = objworkbook.getSheet(sheetName);
		int rowCount = objSheet.getLastRowNum()-objSheet.getFirstRowNum();
		for(int i=0;i<rowCount;i++){
			Row R = objSheet.getRow(i);
			for(int j=0;j<R.getLastCellNum();j++){
				System.out.print(R.getCell(j).toString()+"\t");
			}
			System.out.println();
		}
		fis.close();
	}
	
	public static void main() throws IOException{
		Test3 obj = new Test3();
		obj.readExcel();
	}

}
