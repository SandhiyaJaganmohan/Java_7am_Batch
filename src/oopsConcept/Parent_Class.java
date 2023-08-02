package oopsConcept;

public class Parent_Class {
	
	int a= 10;
	int b=20;
	int c=a+1;

	
	public void multi() {
		 int a = 10; // Initialization;
		int b =20; // Declaration
		int c= a*b;
		System.out.println(c);
	}
	
	public void div() {
		System.out.println("this is division");
	}
	
	public static void main(String[] args) {
	// classname obj.name = new classname();
		
		Parent_Class calc = new Parent_Class();
		calc. div();
	}
	
	}

