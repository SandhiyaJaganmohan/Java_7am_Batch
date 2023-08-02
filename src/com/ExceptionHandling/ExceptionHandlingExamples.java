package com.ExceptionHandling;

public class ExceptionHandlingExamples {
public static void main(String[] args) {
	int a=10;
	int b =0;
	int c=0;
	try {	
		 c= a /b;
		 System.out.println("the answer is "+c);
	
		
	int[] z =null;	
	System.out.println(z[0]);
	
	}
	
	catch(ArithmeticException e) {
		System.out.println("arithmetic exception caught");
	}
	catch(NullPointerException e) {
		System.out.println("Nullpointer exception caught");
	}
	catch(Exception e) {
		System.out.println("Exceptions handled");
	}
	
	System.out.println("END OF THE PROGRAM ");

}
}
