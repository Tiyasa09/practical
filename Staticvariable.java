package activity;

 class Staticvariable1 {
	 int rollno;
	 String name;
	 float fee;
	 static String college="SKC";
	 Staticvariable1(int rollno,String name,float fee){
		 this.rollno=rollno;
		 this.name=name;
		 this.fee=fee;
	 }
	 void display() {
		 System.out.println(rollno+" "+name+" "+fee+" "+college);
	 }
	 public class Staticvariable{
	 public static void main(String[] args) {
		 Staticvariable1 s1=new Staticvariable1(23,"tiyasa",500);
		 Staticvariable1 s2=new Staticvariable1(32,"ankita",400);
		 s1.display();
		 s2.display();
		 
	 }}}
