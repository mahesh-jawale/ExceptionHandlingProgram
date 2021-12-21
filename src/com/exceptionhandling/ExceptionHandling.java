package com.exceptionhandling;
import java.util.Scanner;

public class ExceptionHandling {
	public void nullPointerException()
	{
		String strName=null;
		
		try {
			
			if(strName.equals("mahesh"))
			{
				System.out.println("String is same");
			}
			else{
				System.out.println("String is not same");
			}
			
		} catch (Exception exception) {
			System.out.println("I got exception : "+exception.getMessage());
			exception.printStackTrace();
		}
	}
	
	public void numberFormatException()
	{
		int intNumber;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter any number");
			intNumber = Integer.parseInt(sc.next());
			System.out.println("Entered number is"+intNumber);
			
		} catch (Exception exception) {
			System.out.println("I got exception : "+exception.getMessage());
			exception.printStackTrace();
		}
	}
	
	public void arithmeticException()
	{
		int intFirstNumber=20,intSecondNumber=0,intThirdNumber;
		
		try {
			intThirdNumber=intFirstNumber/intSecondNumber;
			
			
		} catch (Exception exception) {
			System.out.println("I got exception : "+exception.getMessage());
			exception.printStackTrace();
		}
	}
	
	public void arrayIndexOutOfBoundException()
	{
		String strArray[]={"Mahesh","Nikhil","Jay","Shubham"};
		try {
		
			for(int i=0;i<=strArray.length;i++)
			{
				System.out.println(strArray[i]); 
			}
		
			
		} catch (Exception exception) {
			System.out.println("I got exception : "+exception.getMessage());
			exception.printStackTrace();
		}
		
	}
}
