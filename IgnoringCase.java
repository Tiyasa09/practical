package string;

public class IgnoringCase {
	public static void main(String[] args) {
		String str1="This is Program 1";  //initialize string1
		String str2="This is program 1";  //initialize string2
		System.out.println("string 1:" +str1);
		System.out.println("string 2:" +str2);
		int result=str1.compareToIgnoreCase(str2);  //using comparetoignorecase method
		if (result<0) {
			System.out.println("\""+str1+"\""+"is less than"+"\""+str2+"\"");
		} else if(result==0){
			System.out.println("\""+str1+"\""+"is equal to"+"\""+str2+"\"");
		}else if(result>0) {
			System.out.println("\""+str1+"\""+"is greater than"+"\""+str2+"\"");
		}
	}

}
