/**
 * 
 */
package com.sellabs.practice;

/**
 * @author bipas
 *
 */
public class SampleTest {
	
	 static int a = 10;
	 int b = 12;
	
	public static void main(String[] args) {
		
		SampleTest st1 = new SampleTest();
		SampleTest st2 = new SampleTest();
		
		//a++;
		st1.b = st1.b++;
		
		System.out.println(++a);
		System.out.println(st1.b);
		
		
		
	}

}
