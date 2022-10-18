package exception;

public class MultipleCatch {
	static void mFunc() {
		try {
			int i=44/0;
			int arr[]=new int[3];
			arr[4]=23;
		}catch(ArithmeticException e){
			System.out.println(e);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block");
		}
	}
	public static void main(String[] args) {
		mFunc();
	}

}
