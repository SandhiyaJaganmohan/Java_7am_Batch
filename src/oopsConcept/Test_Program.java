package oopsConcept;

import java.util.Scanner;

public class Test_Program {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("enter your name: ");
		
		String name =input.next();
		
		System.out.println("How many java classess are over: ");
		
		int classNum=input.nextInt();
		int currentClassNum = classNum+1;

		
		System.out.println(" Hello "+name+" Welcome to "+currentClassNum+ "th Java class" );
		
		
		

		


}}
