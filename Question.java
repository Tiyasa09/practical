package string;

public class Question {
public static void main(String[] args) {
	String a="java";
	String b="coding";
	String c="Java";
	System.out.println(a.equals(b)+" "+a.compareToIgnoreCase(c)+" "+b.substring(3).toUpperCase());
	
}
}
