package activity;
class Shape1{
	void print() {
		System.out.println("print circle");
	}
}
class Size1 extends Shape1{
	void print() {
		System.out.println("print triangle");
		super.print();
	}
}
public class Super {

	public static void main(String[] args) {
		Size1 obj=new Size1();
		obj.print();

	}

}
