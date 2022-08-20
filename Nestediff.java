package operator1;

public class Nestediff {

	public static void main(String[] args) {
		String address ="Kolkata,India";
		if(address.endsWith("India")) {
			if(address.contains("Dunlop")) {
				System.out.println("your city is Dunlop");
			}else if(address.contains("Newtown")) {
				System.out.println("your city is Newtown");
			}else {
				System.out.println(address.split(",")[0]);
			}
		}else {
			System.out.println("you are not living in India");
			}
	

	}

}
