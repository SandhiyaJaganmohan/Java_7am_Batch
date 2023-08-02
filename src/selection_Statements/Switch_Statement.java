package selection_Statements;

public class Switch_Statement {
	public static void main(String[] args) {
		
	
	int number=34;
	String size;
	
	switch(number) {
	
	case 30:
		size="small";
		break;
	case 34:
		size ="medium";
		break;
	case 40:
		size ="large";
		break;
	case 42:
		size="extra-large";
		break;
		
		default:
			size="no match";
	
	}
	System.out.println("size: "+size);
	
	}

}
