package operator1;

 class Object1 {
	int age;
	String name;
}
class Object{

	public static void main(String[] args) {
		//initialized object by reference
		Object1 ob=new Object1();
		Object1 ob1=new Object1();
		Object1 ob2=new Object1();
		ob.age=30;
		ob.name ="tiyasa";
		ob1.age=23;
		ob1.name="sanjukta";
		ob2.age=34;
		ob2.name="ankita";
		System.out.println(ob.age+" "+ob.name);
		System.out.println(ob1.age+" "+ob1.name);
		System.out.println(ob2.age+" "+ob2.name);
	}}