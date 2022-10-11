package string;
import java.util.Scanner;
public class StringEquality {
	public static void main(String[] args) {
		String str1,str2;
		Scanner sc=new Scanner(System.in);  //using scanner class
		System.out.println("enter first string");
		str1=sc.nextLine(); //initialize str1 from user
		System.out.println("enter second string");
		str2=sc.nextLine(); //initialize str2 from user
		System.out.println(str1.equals(str2));
		
	}

}
