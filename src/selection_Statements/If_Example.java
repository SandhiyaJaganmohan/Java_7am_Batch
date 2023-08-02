package selection_Statements;

public class If_Example {
	
public static void main(String[] args) {
	int age=75;
	
	if(age<=18) {
		System.out.println("you are a kid ");
            }
	else if (age>18 &&  age<=35){
		System.out.println("you are 90's kid");
	}
	else if (age>35 && age<=50) {
		System.out.println("you are 80's kid ");
	}
	else {
		System.out.println("you are a legend");
	}
	}

}
 