/**
 * 
 */
package com.sellabs.wdprogram2;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * @author bipas
 *
 */
public class ExcelHandling {

	
	@DataProvider(name="datasource-1")
	public Object[][] fetchData() throws BiffException, IOException {
		
	Workbook wb = Workbook.getWorkbook(new File(System.getProperty("user.dir")+"\\data.xls"));
	Sheet sh=wb.getSheet("Sheet1");
	int rows=sh.getRows();
	int columns=sh.getColumns();
	String data[][]= new String[rows][columns];
	
	for(int i=0; i<rows;i++) {
		for(int j=0; j<columns; j++)
		{
			Cell c=sh.getCell(j, i);
			data[i][j]=c.getContents();
	//		System.out.print(data[i][j]+"\t");
			
	}
		
	
}
	return data;
	
}
	
}
