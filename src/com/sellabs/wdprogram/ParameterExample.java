/**
 * 
 */
package com.sellabs.wdprogram;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author bipas
 *
 */
public class ParameterExample {
	
	@Parameters({"value1"})
	@Test
	public void ops(int a)
	{
		System.out.println("value is "+a);
	}

}
