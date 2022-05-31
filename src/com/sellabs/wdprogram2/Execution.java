/**
 * 
 */
package com.sellabs.wdprogram2;

import org.testng.annotations.Test;

/**
 * @author bipas
 *
 */
public class Execution {
	
	@Test(dataProvider="datasource-1",dataProviderClass = ExcelHandling.class)
	public void execution(String a, String b, String c)
	{
		int val1 = Integer.parseInt(a);
		int val2 =  Integer.parseInt(b);
		int val3 = Integer.parseInt(c);
		
		System.out.println(val1 + val2 + val3);
		
		
	}
	

}
