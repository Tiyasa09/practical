package operator1;
import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pt=new Scanner(System.in);//System.in is a standard input stream
		System.out.println("Enter first number:");
		int a=pt.nextInt();
		System.out.println("Enter second number:");
		int b=pt.nextInt();
		System.out.println("Enter third number:");
		int c=pt.nextInt();
		int d=a+b+c;
		System.out.println("total:"+d);
		
		

	}

}
