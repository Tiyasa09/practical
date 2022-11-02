package thread;
//using thread class
/*public class ThreadCons {
	public static void main(String[] args) {
		Thread obj=new Thread("Tiyasa");//using constructor Thread(String name)
		obj.start();//move to active state
		String st=obj.getName();//thread name by invoking getname method
		System.out.println(st);
	}

}*/

//runnable interface
public class ThreadCons implements Runnable{
	public void run() {
		System.out.println("thread activated");
	}
	public static void main(String[] args) {
		Runnable r=new ThreadCons();
		Thread obj=new Thread("Tiyasa");//using Thread(runnable r,String name)
		obj.start();//move to active state
		String st=obj.getName();//thread name by invoking getname method
		System.out.println(st);
	}

}
