package exception;

public class ExceptionEx {
	public void show() {
		String a="i am error";
		System.out.println(a);
		try {
			int i=33/0; //Arithmetic exception
			System.out.println(i);
			String s="riya";
			System.out.println(s.length());
			int arr[]=new int[3];
			arr[4]=22; //index out of bound exception
			int n=Integer.parseInt(s); //number format exception
			System.out.println(n);
		}catch(Exception e){
			System.out.println(e);
			
		}
		String b="i cannot be handled";
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		ExceptionEx ee=new ExceptionEx();
		ee.show();
	}

}
