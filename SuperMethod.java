package activity;
class Shape11{
	void print() {
		System.out.println("print circle");
	}
}
class Size11 extends Shape11{
	void print() {
		System.out.println("print triangle");}
		void display() {
			System.out.println("print nothing");
		}
		void show() {
			print();
		super.print();
		display();
	}
}



public class SuperMethod {

	public static void main(String[] args) {
		Size1 obj=new Size1();
		obj.print();

	}

}
