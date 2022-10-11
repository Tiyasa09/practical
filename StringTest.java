package string;
import java.util.Scanner;

public class StringTest {
	public void show() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String A=sc.next(); //1st string 
		String B=sc.next();  //2nd string
		
		System.out.println(A.length()+B.length());
		System.out.println((A.compareTo(B)>0)? "yes" :"no");
		System.out.println(A.substring(0,1).toUpperCase()+A.substring(2)+" "+B.substring(0,1).toUpperCase()+B.substring(2));
	}
	public static void main(String[] args) {
		StringTest st=new StringTest();//creating object
		st.show();//method calling through object
	}

}
