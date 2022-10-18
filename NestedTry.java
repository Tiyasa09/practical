package exception;

public class NestedTry {
	public static void main(String[] args) {
		try {//outer try block
			try {//inner try block1
				System.out.println("divide by 0");
				int b=12/0;
			}catch(ArithmeticException e) {//for inner try block1
				System.out.println(e);
			}
			try {//inner try block2
				int a[]=new int[4];
				a[6]=55;
				
			}catch(ArrayIndexOutOfBoundsException e) {//for try block2
				System.out.println(e);
			}
			System.out.println("other statement");
		}
		catch(Exception e) {//for outer try block
			System.out.println("handled exception");
		}
		System.out.println("normal flow");
	}

}
