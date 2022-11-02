package string;

public class Autoboxing {
	public static void main(String[] args) {
		int a=10;//primitive type
		Integer i=Integer.valueOf(a);//converting int to Integer
		Integer j=a;//now compiler will write Integer.valueof(a) autoboxing
		System.out.println(a+" "+i+" "+j);
	}

}
