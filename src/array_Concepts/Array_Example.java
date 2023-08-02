package array_Concepts;

public class Array_Example {

	public static void main(String[] args) {

		// datatype[] arrayname = new dataype[value];
		
		int[] eggtray = new int[15]; //array declaration
		
		eggtray[0]=20;
		eggtray[1]=30;
		eggtray[2]=40;
		eggtray[3]=50;
		
		
		for(int i=0 ; i<=3;i++) {
			
		System.out.println(eggtray[i]);
	}
		
		//  for(datatype ref :arrayname)
		
		for (int i : eggtray) {
			System.out.println(i);
		}
	}

}
