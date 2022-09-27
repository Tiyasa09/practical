package array;

public class ClassNameArray {
	public static void main(String[] args) {
		//declaration & initialization of an array
		int a[]= {2,3,4};
		//getting the class name
		Class c=a.getClass();
		String name=c.getName();
		//print the class name
		System.out.println(c);
	}

}
