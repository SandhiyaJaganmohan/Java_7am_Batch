package com.collection_concept;
import java.util.HashSet;
public class HashSetConcept {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add(null);
		hs.add("2");
		hs.add("2");
		System.out.println(hs);
	}
	
}
