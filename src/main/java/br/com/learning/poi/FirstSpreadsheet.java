package br.com.learning.poi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import br.com.learning.poi.model.Person;

public final class FirstSpreadsheet {

	/**
	 * 
	 * @param fileName
	 * @param people - data of Spreadsheet
	 * @throws IOException 
	 */
	public void buildSpreadsheet(String fileName, List<Person> people) throws IOException{
		
		Workbook wb = createWorkbook(fileName);
		
		Sheet sheet = wb.createSheet("People");
				
		int index = 0;
		for(Person p : people) {
			Row row = sheet.createRow(index++);
			row.createCell(0).setCellValue(p.getName());
			Cell cell = row.createCell(1);
			cell.setCellValue(p.getBirthDate());
			CellStyle style = wb.createCellStyle();
			style.setDataFormat(wb.createDataFormat().getFormat("d/m/yy"));
			cell.setCellStyle(style);
			row.createCell(2).setCellValue(p.getCountry());
		}
		
		try(FileOutputStream  fos = new FileOutputStream(fileName)) {
			wb.write(fos);
		}
		
	}
	
	/**
	 * create Workbook based on file name
	 * @param fileName
	 * @return {@link Workbook} - {@link XSSFWorkbook} if file ends with .xlsx or
	 * 							{@link HSSFWorkbook} if file ends with .xls
	 * @throws IllegalArgumentException if file name dont finish with '.xlsx' or '.xls'
	 */
	private Workbook createWorkbook(String fileName) {
		if (fileName.toLowerCase().endsWith(".xlsx"))
			return new XSSFWorkbook();
		else if (fileName.toLowerCase().endsWith(".xls"))
			return new HSSFWorkbook();
		else 
			throw new IllegalArgumentException("Invalid file extension");
		
	}
	
}
