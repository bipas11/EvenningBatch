/**
 * 
 */
package com.sellabs.wdprogram;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

/**
 * @author bipas
 *
 */
public class TestingProg {
	
	@Test(priority=1)
	public void B() {
		
		System.out.println(10);
	}
		
		@Test(priority=2, dependsOnMethods = {"B"}, alwaysRun=true)
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
				@BeforeMethod
				public void precond() {
					
					System.out.println("before method");
				}
	
}
