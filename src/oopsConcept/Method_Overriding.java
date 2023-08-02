package oopsConcept;

public class Method_Overriding extends Method_Overloading{

	@Override
	public void number(int a, int b) {
		
	System.out.println("method is overrided  ");
		
	}
	
	public static void main(String[] args) {
		Method_Overriding z = new Method_Overriding();
		
		z.number(10, 20);
	}
	
}


