package string;

public class MutableExample {
public static void my() {
	StringBuffer s=new StringBuffer("Hello"); //creating object of stringbuffer
	s.append("World");
	System.out.println("String is:" +s);
	s.insert(2, "Riya"); //insert in position 2
	System.out.println("insert is:"+s);
	s.replace(1, 3, "java"); //replace from position 1 to before position 3 
	System.out.println("replace is:"+s);
	System.out.println("capacity is:"+s.capacity()); //printing line for capacity
	StringBuilder s1= new StringBuilder("world"); //creating object of stringbuilder
	s1.replace(1, 3, "java"); //replace o,r to java
	System.out.println("replace is:"+s1);
	s1.delete(1, 3);  //delete j,a
	System.out.println("delete is:"+s1);
	s1.reverse(); //reverse
	System.out.println("reverse is:"+s1);
}
public static void main(String[] args) {
	my();
}
}
