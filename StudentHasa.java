package activity;

public class StudentHasa {
	int id;
	String name;
	 AddressHasa address;
	 public StudentHasa(int id,String name, AddressHasa address) {
		 this.id=id;
		 this.name=name;
		 this.address=address;
	 }
	 void show() {
		 System.out.println(id+" "+name);
		 System.out.println(address.city+" "+address.state+" "+address.area+" "+address.country);
	 }
public static void main(String ...args) {
	 AddressHasa ad=new  AddressHasa("champahati","wb","sonarpur","india");
	 StudentHasa cc=new StudentHasa(222,"tiyasa",ad);
	 cc.show();
}
}
