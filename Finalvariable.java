package activity;

final class Finalvariable {
	final int value=50;
	final void display() {
		//we cant change the final value
		// value=40; //compile time error
		System.out.println(value);
	}
	//we cant extend the final class
	class Finalkeyword extends Finalvariable{  //compilation error
		//we cant override final method
		void display() {  //compile time error
			System.out.println("any");
		}
	}

	public static void main(String[] args) {
		Finalvariable fv=new Finalvariable();
		fv.display();

	}

}
