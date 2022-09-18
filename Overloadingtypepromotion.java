package activity;

public class Overloadingtypepromotion {
void add(int a,int b) {
	System.out.println(a+b);
}
void add(long a,long b) {
	System.out.println(a+b);
}
	public static void main(String[] args) {
		 Overloadingtypepromotion obj= new  Overloadingtypepromotion();
		 obj.add(5, 3);

	}

}
