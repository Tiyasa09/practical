package collection;

import java.util.ArrayList;

public class ArrayCompare {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("rose");
		a.add("sunflower");
		a.add("rose");
		a.add(0, "lilly");
		a.add(2, "daisy");
		a.add("merigold");
		a.add(6, "tulip");
		a.add("jasmine");
		a.add("orchid");
		a.add("lotus");
		System.out.println(a);
			ArrayList<String> a1=new ArrayList<String>();
			a1.add("rose");
			a1.add("sunflower");
			a1.add("rose");
			a1.add("merigold");
			a1.add("jasmine");
			a1.add("orchid");
			a1.add("lotus");
			System.out.println(a1);
			//compare
			boolean b=a.equals(a1);
			System.out.println(b);
			System.out.println("common element: "+a.retainAll(a1));//common element
			System.out.println("size: "+a.size());

}}
