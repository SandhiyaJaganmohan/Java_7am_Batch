package oopsConcept;

public class Method_Overloading {
	
	
	public void number(int a , int b) {
		
		System.out.println("method 1 "+a+" "+ b );
		
	}
	
   public void number(int a, int b, int c) {
		
		System.out.println("method 2 "+a+" "+b+" "+c);
	}
	
	public void number(long d , String name) {
		
		
		System.out.println("method 3 "+ d+ " "+name);
		
	}

	
	

	public static void main(String[] args) {
		
		Method_Overloading num = new Method_Overloading();
		
		num.number(10,20);
		num.number(23456, "lenin");
		num.number(1, 2);
		
		
	}

}
