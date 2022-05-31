/**
 * 
 */
package com.sellabs.assign;

import java.util.Scanner;

/**
 * @author bipas
 *
 */

public class AssignProg {
	
	/** This method will be used to print even numbers **/
	
	public void printeven() {
		
		System.out.println("Even numbers are as below:");
		for(int i =10;i <= 37;i++)
		{
			
			if (i % 2 == 0)
				
			{
				
				System.out.println(i);
				
				
			}
			
			
		}
		
		System.out.println("------------------------------------------");
	}

	/**This method will be used to print prime numbers**/
		
		public void printprime() 
		{
			System.out.println("Prime numbers are as below:");
			for(int i=71 ; i<= 93; i++)
			{
		       int counter = 0;
		      for(int num = i; num >= 1; num--)
		      {
		    	  
		    	  if(i % num == 0)
		    	  {
		    		  counter = counter + 1;
		    		  
		    	  }
		      }
		     if(counter == 2) 
		     {
		    	 System.out.println(i);
		     }
			}
			
			System.out.println("------------------------------------------------");
		}		
		
		
	/**This method will be used to print pyramid triangle stars**/
		
		public void printstar()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter the value of n :");
			int n=sc.nextInt();
			
			System.out.println("Pyramid Triangle Star:");
			for (int i=0; i<n; i++)   
			{
			   
			for (int j=n-i; j>1; j--)   
			{  
			 
			System.out.print(" ");   
			}   
			  
			for (int j=0; j<=i; j++ )   
			{   
			    
			System.out.print("* ");   
			}  
			
			System.out.println();
		 }
	}
		
		
}
	              
	
		
		


