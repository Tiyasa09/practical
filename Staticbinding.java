package activity;
//variable have a type
/*public class Staticbinding {
int a=30;//a is a integer type of variable
//reference have a type
Staticbinding s;
//object have a type
Staticbinding bd=new Staticbinding();*/
public class Staticbinding{
	//in static binding methods are static,final,private
	private void show() {
		System.out.println("Static binding");
	}
	public static void main(String[] args) {
		Staticbinding sb=new Staticbinding();
		sb.show();
	}
}
