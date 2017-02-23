package br.com.learning.poi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import br.com.learning.poi.model.Month;

public class TestSpreadsheetWithStyle{

	@Test public void testBuildSpreadsheet_xlsx() {
		SpreadsheetWithStyle spsws = new SpreadsheetWithStyle();
		try {
			spsws.buildSpreadsheet("SpreadsheetWithStyle.xlsx", createResearchResult());
		} catch (IOException e) {
			fail();
		}
    }
	
	@Test public void testBuildSpreadsheet_xls() {
		SpreadsheetWithStyle spsws = new SpreadsheetWithStyle();
		try {
			spsws.buildSpreadsheet("SpreadsheetWithStyle.xls", createResearchResult());
		} catch (IOException e) {
			fail();
		}
    }
	
	@Test public void throwsExceptionWhenCSV() {
		SpreadsheetWithStyle spsws = new SpreadsheetWithStyle();
		try {
			spsws.buildSpreadsheet("SpreadsheetWithStyle.csv", createResearchResult());
		} catch (Exception e) {
			assertEquals("Invalid file extension", e.getMessage());
		}
    }
	
	private Map<String, Map<Month, String>> createResearchResult() {
		Map<String, Map<Month, String>> result = new LinkedHashMap<>();
		Map<Month, String> byMonth = new HashMap<>();
		
		byMonth.put(Month.JANUARY, "95");
		byMonth.put(Month.FEBRUARY, "45");
		byMonth.put(Month.MARCH, "63");
		byMonth.put(Month.APRIL, "96");
		byMonth.put(Month.MAY, "65");
		byMonth.put(Month.JUNE, "93");
		byMonth.put(Month.JULY, "54");
		byMonth.put(Month.AUGUST, "87");
		byMonth.put(Month.SEPTEMBER, "32");
		byMonth.put(Month.OCTOBER, "12");
		byMonth.put(Month.NOVEMBER, null);
		byMonth.put(Month.DECEMBER, null);
		result.put("Action", byMonth);
		
		
		byMonth = new HashMap<>();
		byMonth.put(Month.JANUARY, "95");
		byMonth.put(Month.FEBRUARY, "45");
		byMonth.put(Month.MARCH, "63");
		byMonth.put(Month.APRIL, "96");
		byMonth.put(Month.MAY, "65");
		byMonth.put(Month.JUNE, "93");
		byMonth.put(Month.JULY, "54");
		byMonth.put(Month.AUGUST, "87");
		byMonth.put(Month.SEPTEMBER, "32");
		byMonth.put(Month.OCTOBER, "12");
		byMonth.put(Month.NOVEMBER, "65");
		byMonth.put(Month.DECEMBER, "75");
		result.put("Adventure", byMonth);
		
		byMonth = new HashMap<>();
		byMonth.put(Month.JANUARY, null);
		byMonth.put(Month.FEBRUARY, null);
		byMonth.put(Month.MARCH, null);
		byMonth.put(Month.APRIL, null);
		byMonth.put(Month.MAY, "65");
		byMonth.put(Month.JUNE, "93");
		byMonth.put(Month.JULY, "54");
		byMonth.put(Month.AUGUST, "87");
		byMonth.put(Month.SEPTEMBER, "32");
		byMonth.put(Month.OCTOBER, "12");
		byMonth.put(Month.NOVEMBER, "65");
		byMonth.put(Month.DECEMBER, "75");
		result.put("Animated", byMonth);
		
		
		byMonth = new HashMap<>();
		byMonth.put(Month.JANUARY, null);
		byMonth.put(Month.FEBRUARY, null);
		byMonth.put(Month.MARCH, null);
		byMonth.put(Month.APRIL, null);
		byMonth.put(Month.MAY, "65");
		byMonth.put(Month.JUNE, "93");
		byMonth.put(Month.JULY, "54");
		byMonth.put(Month.AUGUST, "87");
		byMonth.put(Month.SEPTEMBER, "32");
		byMonth.put(Month.OCTOBER, "12");
		byMonth.put(Month.NOVEMBER, "65");
		byMonth.put(Month.DECEMBER, "75");
		result.put("Biography", byMonth);
		
		byMonth = new HashMap<>();
		byMonth.put(Month.JANUARY, null);
		byMonth.put(Month.FEBRUARY, null);
		byMonth.put(Month.MARCH, null);
		byMonth.put(Month.APRIL, null);
		byMonth.put(Month.MAY, "65");
		byMonth.put(Month.JUNE, "93");
		byMonth.put(Month.JULY, "54");
		byMonth.put(Month.AUGUST, "87");
		byMonth.put(Month.SEPTEMBER, "32");
		byMonth.put(Month.OCTOBER, "12");
		byMonth.put(Month.NOVEMBER, "65");
		byMonth.put(Month.DECEMBER, "75");
		result.put("Comedy", byMonth);
		
		byMonth = new HashMap<>();
		byMonth.put(Month.JANUARY, null);
		byMonth.put(Month.FEBRUARY, null);
		byMonth.put(Month.MARCH, null);
		byMonth.put(Month.APRIL, null);
		byMonth.put(Month.MAY, "65");
		byMonth.put(Month.JUNE, "93");
		byMonth.put(Month.JULY, "54");
		byMonth.put(Month.AUGUST, "87");
		byMonth.put(Month.SEPTEMBER, "32");
		byMonth.put(Month.OCTOBER, "12");
		byMonth.put(Month.NOVEMBER, "65");
		byMonth.put(Month.DECEMBER, "75");
		result.put("Documentary", byMonth);
		
		byMonth = new HashMap<>();
		byMonth.put(Month.JANUARY, null);
		byMonth.put(Month.FEBRUARY, null);
		byMonth.put(Month.MARCH, null);
		byMonth.put(Month.APRIL, null);
		byMonth.put(Month.MAY, "65");
		byMonth.put(Month.JUNE, "93");
		byMonth.put(Month.JULY, "54");
		byMonth.put(Month.AUGUST, "87");
		byMonth.put(Month.SEPTEMBER, "32");
		byMonth.put(Month.OCTOBER, "12");
		byMonth.put(Month.NOVEMBER, "65");
		byMonth.put(Month.DECEMBER, "75");
		result.put("Horror", byMonth);
		
		byMonth = new HashMap<>();
		byMonth.put(Month.JANUARY, null);
		byMonth.put(Month.FEBRUARY, null);
		byMonth.put(Month.MARCH, null);
		byMonth.put(Month.APRIL, null);
		byMonth.put(Month.MAY, "65");
		byMonth.put(Month.JUNE, "93");
		byMonth.put(Month.JULY, "54");
		byMonth.put(Month.AUGUST, "87");
		byMonth.put(Month.SEPTEMBER, "32");
		byMonth.put(Month.OCTOBER, "12");
		byMonth.put(Month.NOVEMBER, "65");
		byMonth.put(Month.DECEMBER, "75");
		result.put("Romance", byMonth);
		
		byMonth = new HashMap<>();
		byMonth.put(Month.JANUARY, "356642");
		byMonth.put(Month.FEBRUARY, "354566");
		byMonth.put(Month.MARCH, "354566");
		byMonth.put(Month.APRIL, "354566");
		byMonth.put(Month.MAY, "354566");
		byMonth.put(Month.JUNE, "354566");
		byMonth.put(Month.JULY, "354566");
		byMonth.put(Month.AUGUST, "354566");
		byMonth.put(Month.SEPTEMBER, "354566");
		byMonth.put(Month.OCTOBER, "354566");
		byMonth.put(Month.NOVEMBER, "354566");
		byMonth.put(Month.DECEMBER, "354566");
		result.put("Total people", byMonth);
		
		return result;
	}
	
	
}