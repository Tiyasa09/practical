package exception;
//custom exception
//import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}}


 class CustomExceptionExample {
	 public void checkAge(int age) throws InvalidAgeException{
		 if(age<=18 || age>=25) {
			 throw new InvalidAgeException("invalid for java course");
			 
		 }else {
			 System.out.println("proper age");
		 }
	 }
	 public static void main(String[] args) throws InvalidAgeException {
		 CustomExceptionExample c=new CustomExceptionExample();
		/* Scanner s=new Scanner(System.in);
		 System.out.println("enter age");
		 int age=s.nextInt();
		 c.checkAge(age);*/
		 c.checkAge(15);
		 
	}

}
