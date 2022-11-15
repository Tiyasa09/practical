package collection;

import java.util.ArrayList;

public class ArrayListEx {
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
		a.add(5, "lavender");
		a.add("tiya");
		System.out.println(a);
		System.out.println("sixe of array: " +a.size());
		System.out.println("index element: " +a.get(5));
		a.remove(6);
		a.set(7, "daliya");
		System.out.println(a);
		System.out.println("size: " +a.size());
	}

}
