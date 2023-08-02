package string_Concept;

public class String_Methods_Examples {
	
	public static void main(String[] args) {
		
		String s = "welcome to_JAVA class";
		String s1 = "and Selenium class";
		
		System.out.println("String =  "+s);
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("Welcome"));
		System.out.println(s.endsWith("ass"));
		System.out.println(s.charAt(3));
		System.out.println(s.trim());
		System.out.println(s1.concat(s1));
		System.out.println(s.substring(11));
		System.out.println(s.substring(10, 21));
//		System.out.println(s.isEmpty());
//		System.out.println(s.isBlank());
		System.out.println(s.indexOf('A'));
		System.out.println(s.indexOf('A'));
	
	

}}
