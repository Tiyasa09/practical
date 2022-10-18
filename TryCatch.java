package exception;

public class TryCatch {
	public static void main(String[] args) {
		try { //may exception occur
			int num=25/0;
			System.out.println("not running after exception line");
		}catch(ArithmeticException e) {//handling exception
			//System.out.println(e);
			System.out.println(25/5);
		}
		System.out.println("run code");
	}

}
