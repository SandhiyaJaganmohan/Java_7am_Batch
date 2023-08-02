package string_Array_Concept;

public class Find_Data_Example {
	
	// Java program to perform the searching
	// operation on a string array

		public static void main(String[] args)
		{
			String[] arr = { "Apple", "Banana", "Orange" };
			String key = "red";
			boolean status = false;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == key) {
					System.out.println("Available at index "
									+ i);
					status = true;
				}
			}
			if (status == false) {
				System.out.println("Not found");
			}
		}
	}



