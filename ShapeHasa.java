package activity;

 class Operation {
	int Square(int a) {
		return a*a;
	}
	}
class ShapeHasa{
	Operation ref;
	double pi=3.14;
	void area(int radius) {
		ref=new Operation();
		int square1=ref.Square(radius);
		double area=pi*square1;
		System.out.println("the area of the circle is:"+area);
	}
	public static void main(String ...args) {
		ShapeHasa ss=new ShapeHasa();
		ss.area(5);
		
		
	}
}