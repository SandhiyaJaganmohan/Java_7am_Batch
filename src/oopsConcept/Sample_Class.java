package oopsConcept;

public  class Sample_Class {
	 static boolean classVariable;
	
	public  Sample_Class() {
	System.out.println("default constructor");

		
	}
	
	public Sample_Class(int d) {
		
		System.out.println("parameterized contructor "+d );
		
	}
	
	
	
	public void add() {
		
		int tamilMark = 50;
		int engMark =60;
		int total =tamilMark+ engMark;
		
		System.out.println("total marks " + total);

	}
	
	
 public static void sub() {
		
		int tamilMark = 50;
		int engMark =60;
		int diff =tamilMark - engMark;
		
		System.out.println(" mark difference  " + diff);

	}
	
	
	
	public static void main(String[] args) {
		
		Sample_Class marks=new Sample_Class(10);	


	
		sub();
		marks.add();
		System.out.println(classVariable);
	
		

		
			}

}
