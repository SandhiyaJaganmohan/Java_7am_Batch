package oopsConcept;

import java.util.Scanner;

public class Scanner_Example {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("what is your name? ");
		
		String name = input.next();
		
		System.out.println("hello "+name);
		
		
	}

}
