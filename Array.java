package operator1;
//anonymous array in java
public class Array {
	public static void main(String[] args) {
		display(new int[] {10,20,30}); //passing anonymous array
	}

	 static void display(int arr[] ) { //no need to passing array within the method
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}

}
