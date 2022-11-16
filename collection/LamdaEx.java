package collection;

import java.util.ArrayList;

//parameter -> expression
public class LamdaEx {
	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(4);
		num.add(7);
		num.forEach((val) ->{System.out.println(val);});
	}

}
