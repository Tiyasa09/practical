package operator1;

public class Parameterizedcons {
	int age;
	String name;
	Parameterizedcons(int a,String n){
		age=a;
		name=n;
	}
	void show() {System.out.println(age+" "+name);
	}
	public static void main(String[] args) {
		Parameterizedcons d=new Parameterizedcons(23,"tiya");
		Parameterizedcons d1=new Parameterizedcons(22,"riya");
		d.show();
		d1.show();
		

	}

}
