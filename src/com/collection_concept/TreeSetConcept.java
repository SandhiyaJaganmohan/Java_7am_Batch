package com.collection_concept;
import java.util.TreeSet;
public class TreeSetConcept {
	
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(7);
		ts.add(78);
		ts.add(34);
		ts.add(1);
		System.out.println(ts);
		
		TreeSet<String> ts1 = new TreeSet<String>();
ts1.add("1");
ts1.add("string");
ts1.add("34");
ts1.add("divya");
ts1.add("21.03.1995");
ts1.add("dsgfd@gfdg.com");
System.out.println(ts1);

System.out.println(ts1.first());
System.out.println(ts1.last());
System.out.println(ts);
System.out.println(ts.headSet(10));
System.out.println(ts.tailSet(10));
System.out.println(ts.pollFirst());
System.out.println(ts.pollLast());
System.out.println("after polling "+ ts);



	}

}
