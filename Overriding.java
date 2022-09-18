package activity;

 class tp {

	void run() {
		System.out.println("running mode on");
	}}
	class Testoverriding extends Overriding{
		void run() {
			System.out.println("running mode off");
		}}
	class Overriding{
		public static void main(String[] args) {
		Testoverriding obj=new Testoverriding();
		obj.run();

	}

}
