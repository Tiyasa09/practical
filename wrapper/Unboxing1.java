package string;

import java.util.ArrayList;

public class Unboxing1 {
	public static void main(String[] args) {
		ArrayList<Integer>a= new ArrayList<Integer>();
		//autoboxing
		a.add(1);
		a.add(5);
		System.out.println("ArrayList:"+a);
		//unboxing
		int a1=a.get(0);
		System.out.println("index 0:"+a1);
	}

}
