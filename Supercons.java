package activity;
class Shape2{
	public Shape2() {
		System.out.println("hello");
	}
}
class Size2 extends Shape2{
	Size2(){
		//super();
		System.out.println("hi");
	}
}

public class Supercons {

	public static void main(String[] args) {
		Size2 obj=new Size2();
		

	}

}
