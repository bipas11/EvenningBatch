/**
 * 
 */
package com.sellabs.wdprogram;

import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author bipas
 *
 */
public class TestingProg2 {
	
	@Test(priority=1)
	public void B() {
		
		System.out.println(10);
		Reporter.log("10", true);
	}
		
		@Test(priority=2)
		public void D() {
			
			System.out.println("D");
		}
			
			@Test(priority=3)
			public void A() {
				
				System.out.println("A");
			}
				
				@Test(priority=4)
				public void C() {
					
					System.out.println("C");

}
	
}
