package oopsConcept;

import java.util.Scanner;

public class Test1_Program {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String name = input.next();
		
		System.out.println("How many java classes are over?  ");
		
		int classNum =input.nextInt() ;
		
		System.out.println("number of classes completed is:"+classNum);
		
		int currentClassNum =classNum +1;
		
		System.out.println(" Hello "+name+" Welcome to "+classNum+"th java class");
		
		
		
	}

}
