package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CompareMethods {
	public static boolean compareList(ArrayList a1,ArrayList a2) {
		return a1.toString().contentEquals(a2.toString())?true:false;
	}
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("rose");
		a1.add("sunflower");
		a1.add("merigold");
		a1.add("jasmine");
		a1.add("orchid");
		a1.add("lotus");
		System.out.println(a1);
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("daliya");
		a2.add("rose");
		a2.add("tulip");
		a2.add("jasmine");
		a2.add("orchid");
		a2.add("lotus");
		System.out.println(a2);
		System.out.println(compareList(a1,a2));
		ArrayList<String> a3=new ArrayList<String>();
		a3.add("rose");
		a3.add("sunflower");
		a3.add("merigold");
		a3.add("jasmine");
		a3.add("orchid");
		a3.add("lotus");
		System.out.println(a3);
		boolean b=a1.equals(a3);
		System.out.println(b);
		boolean b1=a1.equals(a2);
		System.out.println(b1);
		System.out.println(a1.removeAll(a2));
		System.out.println(a2.retainAll(a3));
		System.out.println(a1.contains(a3));
		Collections.reverse(a3);
		System.out.println(a3);
		System.out.println(a1.toString().contentEquals(a3.toString()));
		
		
	}

}
