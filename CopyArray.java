package array;

public class CopyArray {
	public static void main(String[] args) {
		//declaring a source array
		char[] copyFrom= {'d','f','g','p','a'};
		//declaring a destination array
		char[] copyTo=new char[5];
		System.arraycopy(copyFrom, 1, copyTo, 0, 5);
		//print the destination array
		System.out.println(String.valueOf(copyTo));
	}

}
