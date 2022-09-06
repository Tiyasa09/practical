package activity;

public class Thiskeyword {
	 int rollno;
	 String name;
	 float fee;
	 Thiskeyword(int rollno,String name,float fee){
		 this.rollno=rollno;
		 this.name=name;
		 this.fee=fee;
	 }
	 void display() {
		 System.out.println(rollno+" "+name+" "+fee);
	 }
	 public class Test{
	 public static void main(String[] args) {
		 Thiskeyword s1=new Thiskeyword(23,"tiyasa",500);
		 Thiskeyword s2=new Thiskeyword(32,"ankita",400);
		 s1.display();
		 s2.display();
		 
	 }}}



