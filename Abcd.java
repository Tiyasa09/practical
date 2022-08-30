package operator1;

 class Abcd1 {
	 int date;
	 String month;
	 void input(int d,String m) {
		 date=d;
		 month=m;
	 }
	 void display() {
		 System.out.println(date+" "+month);
	 }}
 class Abcd{
	 public static void main(String[] args) {
		Abcd1 ab=new Abcd1();
		Abcd1 ab1=new Abcd1();
		ab.input(12, "august");
		ab1.input(30, "january");
		ab.display();
		ab1.display();
	 }}
 


