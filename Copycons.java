package activity;

public class Copycons {
	//variable along with data type
	int age;
	String name;
	//constructor & initialise
	 Copycons(int a,String n){
		 age=a;
		 name=n;
	 }
	 //cons to initiase another object
	 Copycons ( Copycons c){
		 age=c.age;
		 name=c.name;
	 }
	 void show() {
		 System.out.println(age+" "+name);
	 }
	 public static void main(String[] args) {
		 Copycons c1=new  Copycons(24,"tiyasa");
		 Copycons c2=new  Copycons(c1);
		 c1.show();
		 c2.show();

	}

}
