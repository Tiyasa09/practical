package operator1;

public class ArrayExample {

	public static void main(String[] args) {
		int a[]= {20,43,50};
		System.out.println(largenumber (a));
	}
	public static int largenumber(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		return max;

	}

}
