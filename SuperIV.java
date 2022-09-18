package activity;
class Shape{
	String name="circle";}
class Size extends Shape{
	String name="Triangle";
	void displayname() {
		System.out.println(name);
		System.out.println(super.name);
	}
}

public class SuperIV {

	public static void main(String[] args) {
		Size obj=new Size();
		obj.displayname();

	}

}
