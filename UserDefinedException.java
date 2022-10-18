package exception;

class UserDefinedException1 extends Exception {
	public UserDefinedException1(String s) {
		super(s);
	}}
public class UserDefinedException{
	public static void main(String[] args) {
		try {
			throw new UserDefinedException1("user defined exception");
			
		}catch(UserDefinedException1 c) {
			System.out.println("exception occur");
			System.out.println(c.getMessage());
		}
	}
}
