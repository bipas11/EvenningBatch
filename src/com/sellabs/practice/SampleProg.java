/**
 * 
 */
package com.sellabs.practice;

/**
 * @author bipas
 *
 */
public class SampleProg {
	
	static int a = 10;
	int b=12;
	
	public static void main(String[] args) {
		
		SampleProg sp1 = new SampleProg();
		SampleProg sp2 = new SampleProg();
		
		System.out.println(sp1.a);
		System.out.println(sp1.a++);
		System.out.println(sp1.a);
		System.out.println(sp2.a);
		
		System.out.println("------------------------------");
		
		System.out.println(sp1.b);
		System.out.println(sp1.b++);
		System.out.println(sp1.b);
		System.out.println(sp2.b);
		
	}
	
	
		
	
}
