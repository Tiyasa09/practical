package collection;
//using get set method
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;//arraylist---implements--list interface---extend abstract

public class OverallArrayList {
	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("rose");
		a.add("sunflower");
		a.add("rose");
		a.add("merigold");
		a.add("jasmine");
		a.add("orchid");
		a.add("lotus");
		System.out.println(a);
		Collections.sort(a);//sorting
		//System.out.println("get the element:" +a.get(1));//access element
		//a.set(1, "tulip");//change element
		for(String flower:a)
			System.out.println(flower);
		List<Integer> a1=new ArrayList<Integer>();
		a1.add(23);
		a1.add(12);
		a1.add(52);
		a1.add(45);
		a1.add(55);
		a1.add(34);
		a1.add(26);
		Collections.sort(a1);
		for(Integer number:a1)
			System.out.println(number);
		System.out.println("array list is empty or not? " +a.isEmpty());
		System.out.println("array list is empty or not? " +a1.isEmpty());
	}

}
