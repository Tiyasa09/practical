package string;

import java.util.StringTokenizer;

public class Tokenizer {
public static void my() {
	StringTokenizer t=new StringTokenizer("anudip foundation"); //creating object of tokenizer
	while(t.hasMoreTokens()) //to more token
	System.out.println(t.nextToken(" "));
}
public static void main(String[] args) {
	my();
}
}
