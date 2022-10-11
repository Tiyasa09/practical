package string;

public class Tostringexample {
int rollno;
String name,addr;
Tostringexample(int rollno,String name,String addr){ //Parameterized Constructor
	this.rollno=rollno;
	this.name=name;
	this.addr=addr;
}
public String toString() { //tostring method
	return rollno+" "+name+" "+ addr;
	
}
public static void main(String[] args) {
	Tostringexample s1=new Tostringexample(1,"ram","mum");
	Tostringexample s2=new Tostringexample(2,"Riya","cham");
	System.out.println(s1);
	System.out.println(s2);
}
}
