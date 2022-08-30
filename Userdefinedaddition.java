package operator1;
import java.util.Scanner;

public class Userdefinedaddition {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two number:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	additionTwoNumber(a,b);
	}
	private static void additionTwoNumber(int a,int b) {
		int result=(a+b);
		System.out.println("the result is"+result);
	}}


