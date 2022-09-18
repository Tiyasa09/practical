package activity;

 class Finalinheritance {//parent class
	final void method() {
		System.out.println("aaa");
	}
	}
class abcd extends Finalinheritance{
	void method1() {
		System.out.println("bbb");
	}

	public static void main(String[] args) {
		abcd fv=new abcd();
		fv.method();//we can inherir final method

	}

}
