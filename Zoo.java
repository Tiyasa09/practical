package activity;
//runtime poly
 class Zoo1 {
	 int a=10;
	void bark() {
		System.out.println("barking");
	}
	}
class Cat extends Zoo1{
	int a=20;
	void bark() {
		System.out.println("meow");
	}}
	class Dog extends Zoo1{
		void bark() {
			System.out.println("baff");
		}}
	class Zoo{
	public static void main(String[] args) {
		//reference variable ofd parent class with the help of child class obj
		
		Zoo1 z;
		z=new Cat();
		z.bark();
		//in runtime poly not possible overriding of data member
		System.out.println(z.a);
		 z=new Dog();
		 z.bark();
		 

	}

}
