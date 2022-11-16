package collection;

public interface FunctionalInterface {
	int add(int a,int b);

}
class LambaEg{
	public static void main(String[] args) {
		FunctionalInterface f=(a,b)->{return (a+b);
		//System.out.println("functional interface implemented by lamda expression");
		
		};
		System.out.println(f.add(34,45));
		//f.add();
	}
}
