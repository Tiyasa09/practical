package operator1;

public class Switchmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=5;
		String monthString="";
		switch (month) {
		case 2:monthString= "1=january";
		break;
		case 4:monthString= "2=february";
		break;
		case 6:monthString= "3=march";
		break;
		case 8:monthString= "4=april";
		break;
		case 10:monthString= "5=may";
		break;
		case 12:monthString= "11=november";
		break;
		case 5:monthString= "8=august";
		break;
		default:System.out.println("month is not there");
		}
		System.out.println(monthString);

	}

}
