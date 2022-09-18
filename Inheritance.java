package activity;
class Employeee{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance=250.80;
	double hra=1000.50;
	void Employeee(long id,String name,String address,long phone) {
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phone;
	}
	void calculateSalary() {
		double salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
		System.out.println("salary of"+employeeName+ "is:"+salary);
	}
	void calculateTransportAllowance() {
	double transportAllowance=10*basicSalary/100;
	System.out.println(employeeName+"'s transport allowance is:"+transportAllowance);
	}
	class Manager extends Employeee{
		public Manager(long id,String name,String address,long phone) {
			basicSalary=65000;
		}}
		void calculateTransportAllowance1() {
			double transportAllowance=15*basicSalary/100;
			System.out.println(employeeName+"'s transport allowance is:"+transportAllowance);
		}
		class Trainee extends Employeee{
			public Trainee(long id,String name,String address,long phone) {
			basicSalary=45000;
			}}


		public class Inheritance {

	public static void main(String[] args) {
		Trainee tt=new Trainee(34567, "mini", "delhi", 6534786) ;
			Manager mm=new Manager(23456, "bini", "kolkata", 4567876);
		tt.calculateSalary();
		tt.calculateTransportAllowance();
		mm.calculateSalary();
		mm.calculateTransportAllowance();
	}}}


