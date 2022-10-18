package exception;
//throw unchecked exception
public class ThrowUnchecked {
	public static void eligible(int age) {
		if(age<18) {
			//throw arithmetic exception
			throw new ArithmeticException("you are not eligible");
		}
		else {
			System.out.println("eligible");
		}
	}
	public static void main(String[] args) {
		eligible(12);
		System.out.println("done");
	}

}
