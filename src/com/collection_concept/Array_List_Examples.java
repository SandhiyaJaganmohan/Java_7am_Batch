package com.collection_concept;
import java.util.ArrayList;
public class Array_List_Examples {
	
	public static void main(String[] args) {
		
		 ArrayList al = new ArrayList();
		 
//		 Scanner sc = new Scanner(System.in);
//		 int a;
//		 
//		 for(int i=0;i<3;i++) {
//			 a =sc.nextInt();
//			 al.add(a);
//			 
//			 System.out.println(al);
		 		 
		 
		  al.add(10);
		  al.add(20);
		  al.add(30);
		  al.add(40);
		  al.add(50);
		  al.remove(1);
		  System.out.println(al);

		  
		  al.add(1,60);
          System.out.println(al);
          al.remove(0);
          System.out.println(al);
        for(int i=0;i<4;i++) {
          System.out.println(al.get(i));
        }
        
        al.set(0, 100);
        System.out.println(al);
        System.out.println(al.size());
        
       al.clear();
       System.out.println(al);
         
          
          
		  
		 
		
	}

}
