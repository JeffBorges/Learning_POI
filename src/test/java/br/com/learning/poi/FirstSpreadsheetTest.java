package br.com.learning.poi;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import org.junit.Test;

import br.com.learning.poi.model.Person;

public class FirstSpreadsheetTest {

	@Test public void testBuildSpreadsheet_xlsx() {
		FirstSpreadsheet fsps = new FirstSpreadsheet();
		try {
			fsps.buildSpreadsheet("firstSpreadsheet.xlsx", 
					Arrays.asList(new Person("Josh", new Date(), "USA"),
							new Person("Mari", new Date(), "Canada"),
							new Person("Jack", new Date(), "France"),
							new Person("Arthur", new Date(), "United Kingdom")));
		} catch (IOException e) {
			fail();
		}
    }
	
	@Test public void testBuildSpreadsheet_xls() {
		FirstSpreadsheet fsps = new FirstSpreadsheet();
		try {
			fsps.buildSpreadsheet("firstSpreadsheet.xls", 
					Arrays.asList(new Person("Josh", new Date(), "USA"),
							new Person("Mari", new Date(), "Canada"),
							new Person("Jack", new Date(), "France"),
							new Person("Arthur", new Date(), "United Kingdom")));
		} catch (IOException e) {
			fail();
		}
    }
	
	@Test public void throwsExceptionWhenCSV() {
		FirstSpreadsheet fsps = new FirstSpreadsheet();
		try {
			fsps.buildSpreadsheet("firstSpreadsheet.csv", 
					Arrays.asList(new Person("Josh", new Date(), "USA"),
							new Person("Mari", new Date(), "Canada"),
							new Person("Jack", new Date(), "France"),
							new Person("Arthur", new Date(), "United Kingdom")));
		} catch (Exception e) {
			assertEquals("Invalid file extension", e.getMessage());
		}
    }
	
}
