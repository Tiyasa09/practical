package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TraversingArray {
	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("rose");
		a.add("sunflower");
		a.add("rose");
		a.add("merigold");
		a.add("jasmine");
		a.add("orchid");
		a.add("lotus");
		System.out.println("traversing using for loop");
		for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	}
	System.out.println("traversing using for each loop");
	for(String s:a) {
		System.out.println(s);
	}
	System.out.println("traversing using for iterator");//forward by default
	Iterator it=a.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("traversing using for iterator forward");
	ListIterator<String> it1=a.listIterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
	System.out.println("traversing using iterator backward");
	ListIterator<String> it2=a.listIterator(a.size());
	while(it2.hasPrevious()) {
		System.out.println(it2.previous());
	}
	System.out.println("traversing using forEach() method");
    a.forEach(a1->System.out.println(a1));

}}
