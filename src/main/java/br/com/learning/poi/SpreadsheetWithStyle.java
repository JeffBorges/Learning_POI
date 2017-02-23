package br.com.learning.poi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import br.com.learning.poi.model.Month;

public final class SpreadsheetWithStyle {

	/**
	 * 
	 * @param fileName
	 * @param movieStyles - 
	 * @throws IOException
	 */
	public void buildSpreadsheet(String fileName, Map<String, Map<Month, String>> movieStyles) throws IOException{
		
		Workbook wb = createWorkbook(fileName);
		
		Sheet sheet = wb.createSheet("Research Movie Genres");
		
		int index = 0;
		
		
		for (Map.Entry<String, Map<Month, String>> movieStyle : movieStyles.entrySet()) {
			Row row = sheet.createRow(index++);
			row.createCell(0).setCellValue(movieStyle.getKey());
			
			for (Map.Entry<Month, String> result : movieStyle.getValue().entrySet()) {
				row.createCell(result.getKey().ordinal()+1).setCellValue(result.getValue());
			}
			
			
		}
		
		try(FileOutputStream  fos = new FileOutputStream(fileName)) {
			wb.write(fos);
		}
		
	}

	/**
	 * create Workbook based on file name
	 * 
	 * @param fileName
	 * @return {@link Workbook} - {@link XSSFWorkbook} if file ends with .xlsx
	 *         or {@link HSSFWorkbook} if file ends with .xls
	 * @throws IllegalArgumentException
	 *             if file name dont finish with '.xlsx' or '.xls'
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
