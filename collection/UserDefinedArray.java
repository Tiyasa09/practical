package collection;

import java.util.ArrayList;
import java.util.Iterator;

class Bank {
	long accountNo;
	String customerName;
	double balance;
	int customerAge;
	public Bank(long accountNo,String customerName,double balance,int customerAge) {
		this.accountNo=accountNo;
		this.customerName=customerName;
		this.balance=balance;
		this.customerAge=customerAge;
	}}
public class UserDefinedArray {
	public static void main(String[] args) {
		Bank b=new Bank(12345,"tiyasa",3000.76,24);
		Bank b1=new Bank(12343,"tiya",34000.66,25);
		Bank b2=new Bank(12367,"riya",5000.72,23);
		Bank b3=new Bank(123487,"tttt",32000.78,22);
		ArrayList<Bank> a=new ArrayList<Bank>();
		a.add(b3);
		a.add(b2);
		a.add(b1);
		a.add(b);
		Iterator itr=a.iterator();
		while(itr.hasNext()) {
			Bank ob=(Bank) itr.next();
			System.out.println(ob.accountNo+" "+ob.customerName+" "+ob.balance+" "+ob.customerAge);
		}
		
	}

}
