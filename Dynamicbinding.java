package activity;

 class test {
	 void show() {
		System.out.println("Static binding");
	}}
	class Dynamicbinding extends test{
		void show() {
			System.out.println("Static binding sb");
		}
		
	public static void main(String[] args) {
		test sb=new Dynamicbinding();
		sb.show();
	}
}


