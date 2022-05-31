/**
 * 
 */
package com.sellabs.practice2nd;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Vikram
 *This is a class called Assignment2 which contains Five methods.
 */
public class Assignment2 {
	
	/**
	 * This method prints all numbers in the array (row wise and column wise).
	 */
	 
	public void printingAllValuesInArray()
	{
		/**
		 * Creating a multidimensional array containing values.
		 * The array holds three rows and three columns.
		 */
		int arr[][]={{1,4,7},{7,2,3},{8,1,0}};    
	    
		/**
		 * Creating another array to store the transpose of an array.
		 * Here, the new array hold three rows and three columns.
		 */
		int arr1[][]=new int[3][3];  
		    
		/**
		 * Code to transpose an array.
		 * The outer 'for' loop is for Row while the inner 'for' loop is for column.
		 * After traversing the second array 'arr1[][]' will hold the values of the first 
		 * array 'arr[j][i]' but will exchange the columns for rows and rows for columns.
		 */
		for(int i=0;i<arr.length;i++)
		{
		for(int j=0;j<arr.length;j++)
		{
			arr1[i][j]=arr[j][i];
		}
		
		}    
		  
		System.out.println("Printing the values Row wise :");  
		
		/**
		 * After traversing through the array
		 * we will print the values of the first array 'arr[i][j]' which holds the integers.
		 */
		for(int i=0;i<arr.length;i++) 
		{
		for(int j=0;j<arr.length;j++)
		{    
			System.out.print(arr[i][j]+" ");    
		}    
		System.out.println();		//new line    
		}   
		
		System.out.println("Printing the values Column wise :");
		
		/**
		 * After traversing through the array
		 * we will print the values of the second array 'arr1[i][j]' which holds the transpose values of the 'arr[i][j]'.
		 */
		for(int i=0;i<arr1.length;i++)
		{    
		for(int j=0;j<arr1.length;j++)
		{    
			System.out.print(arr1[i][j]+" ");    
		}    
		System.out.println();		//new line    
		}    
		}
	  

	/**
	 * This method prints only the numbers from a given String.
	 */
	public void onlyNumberFromTheString()
	{
		/** 
		 * String variable 'num' contains the alphanumeric value. 
		 */
		 String num = "ABCgtr3245";
		 /** 
			 * Here we use the substring to provided the integer begin index and end index.
			 */
		System.out.println("Only numbers in the string are : " +num.substring(6, 10)); 
			 	
	}
	
	/**
	 * This method finds out and prints the number of occurrence of all alphabets in a given 
	 * string and also prints the alphabet with maximum occurrence in that string.
	 */
	public void numberOfOccurence()
	{
		/**
		 * String containing alphabets, some of whom are repeating.
		 */
		String s = "malayalam";
		/**
		 * We create ana array counter[] with size 256.
		 * ASCII value ranges upto 256.
		 */
		int counter[] = new int[256]; 
		
		/**
		 * This array holds the occurrence of each character, if a character is found
		 * to be repeating then the 'counter' will increase its value by 1.
		 */
		for (int i = 0; i < s.length(); i++) 
		{
			counter[s.charAt(i)] = counter[s.charAt(i)]+ 1 ;
		}
	
		/**
		 * We create another array with the size of string.
		 */
		char ch[] = new char[s.length()]; 
		/**
		 * For loop to traverse the string
		 */
		for (int i = 0; i < s.length(); i++) 
		{ 
			ch[i] = s.charAt(i); 
			int flag = 0;
			
			/**
			 * For loop to traverse the string
			 */
			for (int j = 0; j <= i; j++) 
			{
			/**
			 * If a char is found in String	then set the flag so
			 * that we can print the occurrence of each character
			 */
		   if (s.charAt(i) == ch[j])  
				flag++;
	   }
		
	   if (flag == 1) 
	   {
		      System.out.println("Occurrence of character " + s.charAt(i) + " in the String is :" + counter[s.charAt(i)]);
		      System.out.println();   
		}
	}
		/**
		 * We create an array 'arr[]' with size 256.
		 * ASCII value ranges upto 256.
		 */
		int arr [] = new int [256];
		/**
		 * For loop to traverse the array.
		 * The 'arr[s.charAt(i)]' checks the value of 'i' which is 0,it then
		 * checks the index of 0 in the given string which is 'a' which is then converted to the ASCII value.
		 * It then checks the 'arr[a's ASCII value]' and initializes it with arr[s.charAt(i)] which is 0 plus 1.
		 * So 'arr[a]' would be initialized with 1.
		 * And then the loop goes back and the value of 'i' is incremented by 1 and the loop continues
		 * 
		 */
		for(int i = 0 ; i<s.length();i++)
		{
			arr[s.charAt(i)] = arr[s.charAt(i)]+1;
		}
		
		/** Integer variable 'max' to find the maximum character.
		 * Variable char to print the character.
		 */
		int max =-1 ;
		char c = ' ';
		/**
		 * For loop to traverse the array.
		 * If 'max' value is less than value stored in the arr[s.charAt(i)] which stores a' ASCII value.
		 * Then store the value of 'arr[s.charAt(i)]' in variable 'max'.
		 * And we store the character fetched from the 'max' in char 'c'.
		 * We can then print the maximum occurring character.
		 */
		for(int i = 0 ; i<s.length(); i++)
		{
			if(max<arr[s.charAt(i)])
			{
				max = arr[s.charAt(i)];
				c = s.charAt(i);
			}
		}
		System.out.println("The alphabet with maximum occurence is : " + c );
}

	
	/**
	 * This method displays the middle character of a String.
	 * If the length of the string is even, it displays two middle characters.
	 * If the length of the string is odd, it displays one middle character.
	 */
	public void getMidCharacters()
	{
		/**
		 * Initialization of string.
		 * The string is then converted to an array and stored in an int type variable.
		 */
		String a = "Selenium";
		char word[] = a.toCharArray();
		int length = word.length/2;
		
		/**
		 * If the modulus of length with 2 is equal to 0, then it is an even length.
		 * If the modulus of length with 2 is not equal to 0, then it is an odd length.
		 */
		if(length % 2 == 0)
		{
			System.out.println("The middle characters of the string are : " +word[length-1] + " "+ word[length]);
		}
		else 
		{
			System.out.println("The middle characters of the string are : " +word[length]);
		}
	}
	
	/**
	 * This method creates five folders with timestamp using For loop.
	 */
	
	public void CreatingFiveFolders()
	{
		/**
		 * The variable 'loc' stores the root location of the project directory where the folders will be created.
		 */
		String loc = System.getProperty("user.dir");
		/**
		 * The variable 'date' holds the instance of new SimpleDateFormat.
		 * We need to pass the format (dd_mm_yyyy-hh_mm_ss) in which we need to ask the date in SimpleDateFormat.
		 * Using the method called 'format' we need to pass 'calender.getInstance().getTime()' which will return 
		 * the date object representing the calender's time value.
		 */
		String date = new SimpleDateFormat("ddMMyyyy-HHmmss").format(Calendar.getInstance().getTime());

		for(int i = 1 ; i<=5 ; i++)
		{
			/**
			 * File class holds the path where the folders will be created along with the folder name with timestamp.
			 * The index 'i' and variable 'date' is concatenated with the location of the folder so that
			 *  multiple folders upto five could be created and the folders would have timestamp as folder name.
			 */
			File f = new File( loc + "\\Sample_" + i + "-" + date);
			/**
			 * The folder is created in the root directory and the output is displayed in the console.
			 */
			System.out.println("Folder has been created : " + f.mkdir()+ " " + "And the Timestamp of the folder is : " + date);
			
			}
		}
	
	
}
	


