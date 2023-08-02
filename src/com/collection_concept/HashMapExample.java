package com.collection_concept;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class HashMapExample {

	public static void main(String[] args) {

		HashMap <String ,String> hm =new HashMap<String, String>();
		
		hm.put("as", "divya");//entry
		hm.put("th", "sathya");
		hm.put("ij", "lenin");
		hm.put("abj", "sankar");
		System.out.println(hm);
		
		HashMap <String ,String> duplicatemap =new HashMap<String, String>();
		duplicatemap.putAll(hm);
		System.out.println("duplicate map "+duplicatemap);
		duplicatemap.clear();
		System.out.println(duplicatemap);
		System.out.println("is Key available "+ hm.containsKey("ij"));
		System.out.println("is value available "+ hm.containsValue("sankar"));
// isEmpty()
		System.out.println("all the keys are "+ hm.keySet());
		System.out.println("all the keys are "+ hm.values());
		
		System.out.println( hm.get("abj"));
		System.out.println(hm.entrySet());
		
		System.out.println("===========================================");
		
		LinkedHashMap <String , String> lhm = new LinkedHashMap <String,String>();
// it maintains insertion order
		lhm.put("156", "ccc");
		lhm.put("123", "ccc");
		lhm.put(null, null);
		System.out.println(lhm);
		System.out.println("=================================");
		
		TreeMap <String , String> tm = new TreeMap <String,String>();
		tm.put("156", "ccc");
		tm.put("123", "ccc");
	tm.put(null, null);
		System.out.println(tm);
	}

}
