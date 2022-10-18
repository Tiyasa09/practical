package exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class NestedCatch {
	public static void main(String[] args) {
		System.out.println("enter two numbers");
try {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("result:"+(a/b));
}catch(InputMismatchException e) {
	System.out.println(e);
}
catch(Exception e) {
	System.out.println("exception");
}}}
