package generic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashSet;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class BaseClass {
	
	public String setPath(String pqr){
	String currentDirectoryPath= System.getProperty("user.dir");
	currentDirectoryPath = currentDirectoryPath + pqr;
	return currentDirectoryPath;
	}
	public void readExcel(){
		
		
	
	}
	public void writeExcel(String fileName, LinkedHashSet<String> lhs) throws IOException{
		
System.out.println("Writing value to Excel");
  File dataFile = new File(this.setPath("\\src\\test\\java\\DataSheet\\"+ fileName));
  XSSFWorkbook workbook = new XSSFWorkbook();
  XSSFSheet sheet = workbook.createSheet();
  int i =0;
  for(String value:lhs){
	  
  
  XSSFRow row = sheet.createRow(1);
  XSSFCell cell = row.createCell(1);
  cell.setCellValue(value);
  i++;
  }
  
  try{
  FileOutputStream fos = new  FileOutputStream(dataFile);
  workbook.write(fos);
  workbook.close();
  }catch (FileNotFoundException e){
	  e.printStackTrace();
  
  
		
  }
}
}


