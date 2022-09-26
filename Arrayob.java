package operator1;

//return an array from the method
 class Arrayob {
	//creating method which returns array
	 static int[] printarray() {
		return new int[]{10,20,30,40,50}; //anonymous array
	 }
	 
	 public static void main(String[] args) {
		//calling method
		 int arr[]=printarray();
	//traversing the array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);

	}

}

}
